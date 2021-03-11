package com.hobbercode.hobberclient;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = HobberClient.MODID, version = HobberClient.VERSION)
public class HobberClient {
	
    public static final String MODID = "hobberclient";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	if(event.getSide() == Side.SERVER) {
    		System.out.println("HobberClient isn't compatable on the server!");
    		return;
    	}
    	
        System.out.println("HobberClient initialized");
    }
    
}