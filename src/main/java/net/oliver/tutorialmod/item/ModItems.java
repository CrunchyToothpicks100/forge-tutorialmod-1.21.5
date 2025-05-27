package net.oliver.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oliver.tutorialmod.TutorialMod;

public class ModItems {
    // For any new items, remember to add it to the AddCreative() method and lang, models, and textures
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> GINGERBREAD = ITEMS.register("gingerbread",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_GINGERBREAD = ITEMS.register("raw_gingerbread",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
