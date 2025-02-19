package com.figgity.endtools;

import com.figgity.endtools.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EndTools.MODID)
public class EndTools
{
    public static final String MODID = "endtools";

    public EndTools() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.Items.register(modEventBus);
        //EntityInit.ENTITY_TYPES.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
