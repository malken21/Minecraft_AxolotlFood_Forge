package marumasa.axolotl_food.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static final RegistryObject<Item> AXOLOTL_FOOD = ITEMS.register("axolotl_bucket",
            () -> new Item((new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC).food(ModFoods.AXOLOTL_FOOD)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}