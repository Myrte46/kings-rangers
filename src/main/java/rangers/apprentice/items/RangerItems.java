package rangers.apprentice.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import rangers.apprentice.RangerMod;

public class RangerItems {
    public static final Longbow LONGBOW = Registry.register(Registries.ITEM, new Identifier(RangerMod.MOD_ID, "longbow"),
            new Longbow(new FabricItemSettings().maxCount(1).maxDamage(1500)));
    public static final SaxeKnifeItem SAXE_KNIFE = Registry.register(Registries.ITEM, new Identifier(RangerMod.MOD_ID, "saxe_knife"),
            new SaxeKnifeItem(new FabricItemSettings()));
    public static final ThrowingKnifeItem THROWING_KNIFE = Registry.register(Registries.ITEM, new Identifier(RangerMod.MOD_ID, "throwing_knife"),
            new ThrowingKnifeItem(new FabricItemSettings()));;


    public static void addItemsToItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.addAfter(Items.BOW, LONGBOW);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.addAfter(Items.NETHERITE_SWORD, SAXE_KNIFE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.addAfter(SAXE_KNIFE, THROWING_KNIFE);
        });
    }

    public static void registerModItems() {
        RangerMod.LOGGER.info("Regestering Mod Items for " + RangerMod.MOD_ID);
        addItemsToItemGroup();
    }
}
