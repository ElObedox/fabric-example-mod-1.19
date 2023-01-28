package net.obed.modprueba.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.obed.modprueba.ModPrueba;
import net.obed.modprueba.item.ModItemGroup;

public class ModBlocks {

    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).luminance(40).strength(4f).requiresTool()), ItemGroup.MATERIALS);

    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
            UniformIntProvider.create(3, 7)),ItemGroup.MATERIALS);

    public static final Block DEEPSLATE_TANZANITE_ORE = registerBlock("deepslate_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)),ItemGroup.MATERIALS);

    public static final Block ENDSTONE_TANZANITE_ORE = registerBlock("endstone_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).luminance(30).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)),ItemGroup.MATERIALS);

    public static final Block NETHERRACK_TANZANITE_ORE = registerBlock("netherrack_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).luminance(30).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)),ItemGroup.MATERIALS);

    public static final Block CHILABLOCK = registerBlock("chilablock",
            new Block(FabricBlockSettings.of(Material.STONE).luminance(60).strength(4f).requiresTool()), ModItemGroup.PUFFLE);

    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(ModPrueba.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(ModPrueba.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks(){
        ModPrueba.LOGGER.debug("Registrnado ModBlocks para "+ ModPrueba.MOD_ID);
    }
}
