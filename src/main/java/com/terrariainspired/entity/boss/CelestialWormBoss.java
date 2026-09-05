package com.terrariainspired.entity.boss;

import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.nbt.NbtCompound;

public class CelestialWormBoss extends HostileEntity {
	private int phase = 1;
	private float baseHealth = 2000.0f;

	public CelestialWormBoss(EntityType<? extends HostileEntity> entityType, World world) {
		super(entityType, world);
		this.setPersistent();
	}

	public static DefaultAttributeContainer.Builder createAttributes() {
		return HostileEntity.createHostileAttributes()
			.add(EntityAttributes.GENERIC_MAX_HEALTH, 2000.0)
			.add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.40)
			.add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 16.0)
			.add(EntityAttributes.GENERIC_ARMOR, 14.0)
			.add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 0.8);
	}

	@Override
	protected void mobTick() {
		super.mobTick();
		
		float currentHealth = this.getHealth();
		float maxHealth = this.getMaxHealth();
		
		// Fase 2: 66% de vida
		if (currentHealth <= maxHealth * 0.66f && phase == 1) {
			phase = 2;
			this.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, Integer.MAX_VALUE, 3));
			this.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, Integer.MAX_VALUE, 2));
		}
		
		// Fase 3: 33% de vida
		if (currentHealth <= maxHealth * 0.33f && phase == 2) {
			phase = 3;
			this.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, Integer.MAX_VALUE, 4));
			this.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, Integer.MAX_VALUE, 3));
		}
	}

	@Override
	public void writeCustomDataToNbt(NbtCompound nbt) {
		super.writeCustomDataToNbt(nbt);
		nbt.putInt("Phase", this.phase);
	}

	@Override
	public void readCustomDataFromNbt(NbtCompound nbt) {
		super.readCustomDataFromNbt(nbt);
		this.phase = nbt.getInt("Phase");
	}

	public int getPhase() {
		return this.phase;
	}
}