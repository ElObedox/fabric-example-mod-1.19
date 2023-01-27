package net.obed.modprueba.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.obed.modprueba.ModPrueba;

public class ModItemGroup {
    public static final ItemGroup PUFFLE = FabricItemGroupBuilder.build(
            new Identifier(ModPrueba.MOD_ID, "puffle"), () ->new ItemStack(ModItems.PUFFLE));
    public static final ItemGroup PUFFLE2 = FabricItemGroupBuilder.build(
            new Identifier(ModPrueba.MOD_ID, "puffle2"), () ->new ItemStack(ModItems.RAW_PUFFLE   ));
}
