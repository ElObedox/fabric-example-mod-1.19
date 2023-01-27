package net.obed.modprueba.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.obed.modprueba.ModPrueba;

public class ModItems {

    public static final Item RAW_PUFFLE = registerItems("raw_puffle",
            new Item(new FabricItemSettings().group(ModItemGroup.PUFFLE2)));

    public static final Item PUFFLE = registerItems("puffle",
            new Item(new FabricItemSettings().group(ModItemGroup.PUFFLE)));

    public static final Item TANZANITE = registerItems("tanzanite",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItems(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ModPrueba.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ModPrueba.LOGGER.debug("Resgistrando Mod Items para " + ModPrueba.MOD_ID);
    }
}
