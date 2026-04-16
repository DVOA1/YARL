package dev.dvoa.yarl;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = YARL.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = YARL.MODID, value = Dist.CLIENT)
public class YARLClient {
    public YARLClient(ModContainer container) {
        Config.load();
        Loader.addPackFinder();
        if (Config.LOAD_RESOURCES) {
            Loader.firstLoadResources();
            Config.LOAD_RESOURCES = false;
            Config.save();
        }
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
    }

}
