package net.mcreator.hk.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class FocusOrbRightClickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) != (entity instanceof LivingEntity _livEnt
				? _livEnt.getMaxHealth()
				: -1) && (entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 1) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 2));
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(-(3));
		}
	}
}
