package net.oliver.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.oliver.tutorialmod.TutorialMod;
import net.oliver.tutorialmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GINGERBREAD_ITEMS_TAB = CREATIVE_MODE_TABS.register("gingerbread_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.GINGERBREAD.get()))
                    .title(Component.translatable("creativetab.tutorialmod.gingerbread_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GINGERBREAD.get());
                        output.accept(ModItems.RAW_GINGERBREAD.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> GINGERBREAD_BLOCKS_TAB = CREATIVE_MODE_TABS.register("gingerbread_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.GINGERBREAD_BLOCK.get()))
                    .withTabsBefore(GINGERBREAD_ITEMS_TAB.getId()) // Ensures tabs are in order
                    .title(Component.translatable("creativetab.tutorialmod.gingerbread_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.GINGERBREAD_BLOCK.get());
                        output.accept(ModBlocks.RAW_GINGERBREAD_BLOCK.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus );
    }
}
