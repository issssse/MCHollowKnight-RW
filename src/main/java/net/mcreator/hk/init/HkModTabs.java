
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hk.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class HkModTabs {
	public static CreativeModeTab TAB_HOLLOW_KNIGHT_TAB;

	public static void load() {
		TAB_HOLLOW_KNIGHT_TAB = new CreativeModeTab("tabhollow_knight_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(HkModItems.HOLLOW_ARMOR_HELMET);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
