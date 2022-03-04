
package net.mcreator.hk.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.hk.procedures.FocusOrbRightClickedProcedure;
import net.mcreator.hk.init.HkModTabs;

public class FocusOrbItem extends Item {
	public FocusOrbItem() {
		super(new Item.Properties().tab(HkModTabs.TAB_HOLLOW_KNIGHT_TAB).stacksTo(1).rarity(Rarity.UNCOMMON));
		setRegistryName("focus_orb");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		FocusOrbRightClickedProcedure.execute(entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		FocusOrbRightClickedProcedure.execute(context.getPlayer());
		return retval;
	}
}
