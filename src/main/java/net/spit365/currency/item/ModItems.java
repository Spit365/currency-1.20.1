package net.spit365.currency.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spit365.currency.Currency;

import java.security.PublicKey;

public class ModItems {

    public static Item COPPER_COIN =registerItem("copper_coin", new Item(new FabricItemSettings()));
    public static Item COPPER_SACK =registerItem("copper_sack", new Item(new FabricItemSettings()));
    public static Item GOLD_COIN =registerItem("gold_coin", new Item(new FabricItemSettings()));
    public static Item GOLD_SACK =registerItem("gold_sack", new Item(new FabricItemSettings()));
    public static Item DIAMOND_COIN =registerItem("diamond_coin", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientsTab(FabricItemGroupEntries entries){
        entries.add(COPPER_COIN);
        entries.add(COPPER_SACK);
        entries.add(GOLD_COIN);
        entries.add(GOLD_SACK);
        entries.add(DIAMOND_COIN);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Currency.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Currency.LOGGER.info("Registering Mod Items for " + Currency.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTab);
    }
}
