package net.spit365.currency.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.spit365.currency.Currency;

public class ModItemGroups {
    public static final ItemGroup CURRENCY_TAB = Registry.register(Registries.ITEM_GROUP, new Identifier(Currency.MOD_ID, "currency_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.currency_tab"))
                    .icon(() -> new ItemStack(ModItems.COPPER_SACK)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.DIAMOND_COIN);
                        entries.add(ModItems.GOLD_SACK);
                        entries.add(ModItems.GOLD_COIN);
                        entries.add(ModItems.COPPER_SACK);
                        entries.add(ModItems.COPPER_COIN);
                    })).build());

    public static void registerModItemGroups (){
        Currency.LOGGER.info("Registering Creative Tabs for" + Currency.MOD_ID);
    }
}
