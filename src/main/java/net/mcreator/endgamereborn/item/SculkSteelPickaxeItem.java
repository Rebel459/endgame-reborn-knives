
package net.mcreator.endgamereborn.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.endgamereborn.init.EndgameRebornModItems;

public class SculkSteelPickaxeItem extends PickaxeItem {
	public SculkSteelPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2736;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EndgameRebornModItems.SCULK_STEEL_INGOT), new ItemStack(Items.ECHO_SHARD), new ItemStack(Blocks.SCULK));
			}
		}, 1, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
