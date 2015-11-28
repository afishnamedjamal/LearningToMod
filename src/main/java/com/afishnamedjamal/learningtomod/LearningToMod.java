package com.afishnamedjamal.learningtomod;

import com.afishnamedjamal.learningtomod.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="LearningToMod", name="Learning To Mod", version="1.7.2-1.0")
public class LearningToMod {

    @Mod.Instance("LearningToMod")
    public static LearningToMod instance;

    @SidedProxy(clientSide = "com.afishnamedjamal.learningtomod.proxy.ClientProxy", serverSide = "com.afishnamedjamal.learningtomod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
