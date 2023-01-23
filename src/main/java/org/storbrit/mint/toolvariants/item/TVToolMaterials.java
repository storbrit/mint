package org.storbrit.mint.toolvariants.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public enum TVToolMaterials implements ToolMaterial {
	DEEPSLATE(1, 192, 4.0F, 1.0F, 5, Ingredient.ofItems(Items.COBBLED_DEEPSLATE)),
	NETHERRACK(1, 76, 5.0F, 1.0F, 14, Ingredient.ofItems(Items.NETHERRACK));

	private final int miningLevel;
	private final int itemDurability;
	private final float miningSpeed;
	private final float attackDamage;
	private final int enchantability;
	private final Ingredient repairIngredient;

	TVToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability,
			Ingredient repairIngredient) {
		this.miningLevel = miningLevel;
		this.itemDurability = itemDurability;
		this.miningSpeed = miningSpeed;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairIngredient = repairIngredient;
	}

	public int getDurability() {
		return this.itemDurability;
	}

	public float getMiningSpeedMultiplier() {
		return this.miningSpeed;
	}

	public float getAttackDamage() {
		return this.attackDamage;
	}

	public int getMiningLevel() {
		return this.miningLevel;
	}

	public int getEnchantability() {
		return this.enchantability;
	}

	public Ingredient getRepairIngredient() {
		return this.repairIngredient;
	}
}
