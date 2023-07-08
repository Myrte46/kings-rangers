package rangers.apprentice;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import rangers.apprentice.entities.RangerEntities;
import rangers.apprentice.util.RangerModelPredicateProvider;

public class RangerClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        RangerModelPredicateProvider.RegisterModModels();
        EntityRendererRegistry.register(RangerEntities.SAXE_KNIFE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(RangerEntities.THROWING_KNIFE, FlyingItemEntityRenderer::new);
    }
}
