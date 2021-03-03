package com.hobbercode.hobberclient;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = HobberClient.MODID, version = HobberClient.VERSION)
public class HobberClient {
	
    public static final String MODID = "hobberclient";
    public static final String NAME = "HobberClient";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("HobberClient initialized");
    }
    
}
