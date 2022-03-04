
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hk.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.hk.item.VengefullSpiritItem;
import net.mcreator.hk.item.OldNailItem;
import net.mcreator.hk.item.NailItem;
import net.mcreator.hk.item.HollowArmorItem;
import net.mcreator.hk.item.FocusOrbItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HkModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item OLD_NAIL = register(new OldNailItem());
	public static final Item NAIL = register(new NailItem());
	public static final Item HOLLOW_ARMOR_HELMET = register(new HollowArmorItem.Helmet());
	public static final Item HOLLOW_ARMOR_CHESTPLATE = register(new HollowArmorItem.Chestplate());
	public static final Item FOCUS_ORB = register(new FocusOrbItem());
	public static final Item VENGEFULL_SPIRIT = register(new VengefullSpiritItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
