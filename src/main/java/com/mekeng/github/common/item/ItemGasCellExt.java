package com.mekeng.github.common.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

/**
 * Dedicated subclass for extended tiers to harden getTotalTypes() against any unintended overrides.
 */
public class ItemGasCellExt extends ItemGasCell {

    public ItemGasCellExt(ItemStack core, ItemStack casing, int kilobytes, double powerDrain, int typeCost) {
        super(core, casing, kilobytes, powerDrain, typeCost);
    }

    public ItemGasCellExt(Item core, ItemStack casing, int kilobytes, double powerDrain, int typeCost) {
        super(core, casing, kilobytes, powerDrain, typeCost);
    }

    @Override
    public int getTotalTypes(@Nonnull ItemStack itemStack) {
        return 15;
    }
}
