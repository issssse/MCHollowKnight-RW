
package net.mcreator.hk.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.hk.init.HkModTabs;

public class NailItem extends SwordItem {
	public NailItem() {
		super(new Tier() {
			public int getUses() {
				return 300;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 4;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, 0f, new Item.Properties().tab(HkModTabs.TAB_HOLLOW_KNIGHT_TAB).fireResistant());
		setRegistryName("nail");
	}
}
