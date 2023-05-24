
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endgamerebornknives.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.endgamerebornknives.item.SteelKnifeItem;
import net.mcreator.endgamerebornknives.item.SculkSteelKnifeItem;
import net.mcreator.endgamerebornknives.item.ReinforcedSteelKnifeItem;
import net.mcreator.endgamerebornknives.item.ProsperousSteelKnifeItem;
import net.mcreator.endgamerebornknives.item.NetheriteKnifeRebornItem;
import net.mcreator.endgamerebornknives.item.GildedSteelKnifeItem;
import net.mcreator.endgamerebornknives.item.FracturedSteelKnifeItem;
import net.mcreator.endgamerebornknives.item.ForgottenSteelKnifeItem;
import net.mcreator.endgamerebornknives.EndgameRebornKnivesMod;

public class EndgameRebornKnivesModItems {
	public static Item STEEL_KNIFE;
	public static Item REINFORCED_STEEL_KNIFE;
	public static Item GILDED_STEEL_KNIFE;
	public static Item FORGOTTEN_STEEL_KNIFE;
	public static Item PROSPEROUS_STEEL_KNIFE;
	public static Item FRACTURED_STEEL_KNIFE;
	public static Item SCULK_STEEL_KNIFE;
	public static Item NETHERITE_KNIFE_REBORN;

	public static void load() {
		STEEL_KNIFE = Registry.register(Registry.ITEM, new ResourceLocation(EndgameRebornKnivesMod.MODID, "steel_knife"), new SteelKnifeItem());
		REINFORCED_STEEL_KNIFE = Registry.register(Registry.ITEM, new ResourceLocation(EndgameRebornKnivesMod.MODID, "reinforced_steel_knife"), new ReinforcedSteelKnifeItem());
		GILDED_STEEL_KNIFE = Registry.register(Registry.ITEM, new ResourceLocation(EndgameRebornKnivesMod.MODID, "gilded_steel_knife"), new GildedSteelKnifeItem());
		FORGOTTEN_STEEL_KNIFE = Registry.register(Registry.ITEM, new ResourceLocation(EndgameRebornKnivesMod.MODID, "forgotten_steel_knife"), new ForgottenSteelKnifeItem());
		PROSPEROUS_STEEL_KNIFE = Registry.register(Registry.ITEM, new ResourceLocation(EndgameRebornKnivesMod.MODID, "prosperous_steel_knife"), new ProsperousSteelKnifeItem());
		FRACTURED_STEEL_KNIFE = Registry.register(Registry.ITEM, new ResourceLocation(EndgameRebornKnivesMod.MODID, "fractured_steel_knife"), new FracturedSteelKnifeItem());
		SCULK_STEEL_KNIFE = Registry.register(Registry.ITEM, new ResourceLocation(EndgameRebornKnivesMod.MODID, "sculk_steel_knife"), new SculkSteelKnifeItem());
		NETHERITE_KNIFE_REBORN = Registry.register(Registry.ITEM, new ResourceLocation(EndgameRebornKnivesMod.MODID, "netherite_knife_reborn"), new NetheriteKnifeRebornItem());
	}
}
