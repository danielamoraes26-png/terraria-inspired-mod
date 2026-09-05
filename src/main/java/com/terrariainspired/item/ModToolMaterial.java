package com.terrariainspired.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ModToolMaterial implements ToolMaterial {
	public static final ModToolMaterial TERRASTEEL = new ModToolMaterial(1, 200, 6.0f, 2.0f, 14);
	public static final ModToolMaterial LUNITE = new ModToolMaterial(2, 350, 8.0f, 2.5f, 15);
	public static final ModToolMaterial CELESTITE = new ModToolMaterial(3, 500, 10.0f, 3.0f, 16);
	public static final ModToolMaterial VOIDSTONE = new ModToolMaterial(4, 750, 12.0f, 3.5f, 17);
	public static final ModToolMaterial DRAGONITE = new ModToolMaterial(5, 1000, 14.0f, 4.0f, 18);
	public static final ModToolMaterial SHADOWITE = new ModToolMaterial(6, 1500, 16.0f, 4.5f, 19);

	private final int miningLevel;
	private final int itemDurability;
	private final float miningSpeed;
	private final float attackDamage;
	private final int enchantability;

	public ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability) {
		this.miningLevel = miningLevel;
		this.itemDurability = itemDurability;
		this.miningSpeed = miningSpeed;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
	}

	@Override
	public int getDurability() {
		return this.itemDurability;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return this.miningSpeed;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public int getMiningLevel() {
		return this.miningLevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.EMPTY;
	}
}