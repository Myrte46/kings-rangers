package rangers.apprentice;

import net.fabricmc.api.ClientModInitializer;
import rangers.apprentice.util.RangerModelPredicateProvider;

public class RangerClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        RangerModelPredicateProvider.RegisterModModels();
    }
}
