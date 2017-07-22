package com.nufflee.tfma.init;

import com.nufflee.nlib.enums.LoaderType;
import com.nufflee.nlib.mod.loader.Loader;
import com.nufflee.tfma.items.ItemIronCookie;
import net.minecraft.item.Item;

@Loader(type = LoaderType.ITEM)
public class ModItems {
    public static Item ironCookie = new ItemIronCookie();
    public static Item cookieCast = new ItemCookieCast();
}
