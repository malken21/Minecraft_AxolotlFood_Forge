package marumasa.axolotl_food;

import marumasa.axolotl_food.item.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(minecraft.MODID)
public class minecraft {

    public static final String MODID = "axolotl_food";
    public minecraft() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(eventBus);
    }
}
