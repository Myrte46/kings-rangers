package rangers.apprentice;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rangers.apprentice.items.RangerItems;

public class RangerMod implements ModInitializer {
    //basic information
    public static final String MOD_ID = "kings-rangers";
    public static final Logger LOGGER = LoggerFactory.getLogger("kings-rangers");

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing King's Rangers, an Origins addon. Enjoy!");
        RangerItems.registerModItems();
    }
}
