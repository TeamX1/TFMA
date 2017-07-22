package com.nufflee.tfma.items.crafting;

import com.nufflee.tfma.init.ModItems;
import net.minecraft.item.ItemStack;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.shared.TinkerFluids;

public class TinkersRecipeHandler {
    public static void registerRecipes() {
        TinkerRegistry.registerTableCasting(new ItemStack(ModItems.ironCookie), new ItemStack(ModItems.cookieCast), TinkerFluids.iron, 1);
        TinkerRegistry.addCastForItem(ModItems.cookieCast);
    }
}
