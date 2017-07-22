package com.nufflee.tfma;

import com.nufflee.nlib.NLib;
import com.nufflee.nlib.proxy.IProxy;
import com.nufflee.tfma.items.crafting.TinkersRecipeHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION, dependencies = Reference.DEPENDENCIES, acceptedMinecraftVersions = Reference.MCVERSION)
public class Main {
    public NLib lib = new NLib();

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.SERVERPROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    private void preInit(FMLPreInitializationEvent event) {
        lib.preInit(event);
    }

    @Mod.EventHandler
    private void init(FMLInitializationEvent event) {
        lib.init(event);
        TinkersRecipeHandler.registerRecipes();
    }

    @Mod.EventHandler
    private void postInit(FMLPostInitializationEvent event) {
        lib.postInit(event);
    }
}