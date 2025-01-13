package net.violetradd.flancraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.violetradd.flancraft.Flancraft;

public class ModItems {

    public static final Item FLAN = registerItem("flan", new Item(new Item.Settings().food(ModFoodComponents.FLAN)));
    public static final Item CARAMEL = registerItem("caramel", new Item(new Item.Settings().food(ModFoodComponents.CARAMEL)));
    public static final Item CUSTARD = registerItem("custard", new Item(new Item.Settings().food(ModFoodComponents.CUSTARD)));
    public static final Item EVAPORATED_MILK = registerItem("evaporated_milk", new Item(new Item.Settings()));
    public static final Item CONDENSED_MILK = registerItem("condensed_milk", new Item(new Item.Settings()));
    public static final Item VANILLA_EXTRACT = registerItem("vanilla_extract", new Item(new Item.Settings()));
    public static final Item VANILLA_BEAN = registerItem("vanilla_bean", new Item(new Item.Settings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Flancraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Flancraft.LOGGER.info("Registering Mod Items for " + Flancraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(FLAN);
            entries.add(CUSTARD);
            entries.add(CARAMEL);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(EVAPORATED_MILK);
            entries.add(CONDENSED_MILK);
            entries.add(VANILLA_EXTRACT);
            entries.add(VANILLA_BEAN);
        });
    }

}
