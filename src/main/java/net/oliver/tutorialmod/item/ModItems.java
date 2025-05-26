package net.oliver.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oliver.tutorialmod.TutorialMod;

public class ModItems {
    // If you add any new items, remember to add it to the AddCreative() method and all the directories under "assets"
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> GINGERBREAD = ITEMS.register("gingerbread",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_GINGERBREAD = ITEMS.register("gingerbread",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
