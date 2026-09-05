package com.terrariainspired.util;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class ArmorEffectHandler {
	public static void applyArmorEffect(PlayerEntity player, String effect) {
		if (effect.equals("strength")) {
			player.addStatusEffect(new StatusEffectInstance(
				net.minecraft.entity.effect.StatusEffects.STRENGTH, 
				1200, 0, false, false));
		} else if (effect.equals("speed")) {
			player.addStatusEffect(new StatusEffectInstance(
				net.minecraft.entity.effect.StatusEffects.SPEED, 
				1200, 1, false, false));
		} else if (effect.equals("flight")) {
			// Flight effect será implementado via custom ability
		} else if (effect.equals("invisibility")) {
			player.addStatusEffect(new StatusEffectInstance(
				net.minecraft.entity.effect.StatusEffects.INVISIBILITY, 
				1200, 0, false, false));
		} else if (effect.equals("resistance")) {
			player.addStatusEffect(new StatusEffectInstance(
				net.minecraft.entity.effect.StatusEffects.RESISTANCE, 
				1200, 0, false, false));
		} else if (effect.equals("night_vision")) {
			player.addStatusEffect(new StatusEffectInstance(
				net.minecraft.entity.effect.StatusEffects.NIGHT_VISION, 
				1200, 0, false, false));
		}
	}
	
	public static void removeArmorEffect(PlayerEntity player, String effect) {
		if (effect.equals("strength")) {
			player.removeStatusEffect(net.minecraft.entity.effect.StatusEffects.STRENGTH);
		} else if (effect.equals("speed")) {
			player.removeStatusEffect(net.minecraft.entity.effect.StatusEffects.SPEED);
		} else if (effect.equals("invisibility")) {
			player.removeStatusEffect(net.minecraft.entity.effect.StatusEffects.INVISIBILITY);
		} else if (effect.equals("resistance")) {
			player.removeStatusEffect(net.minecraft.entity.effect.StatusEffects.RESISTANCE);
		} else if (effect.equals("night_vision")) {
			player.removeStatusEffect(net.minecraft.entity.effect.StatusEffects.NIGHT_VISION);
		}
	}
}