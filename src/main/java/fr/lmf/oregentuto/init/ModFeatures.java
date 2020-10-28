package fr.lmf.oregentuto.init;

import fr.lmf.oregentuto.Main;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.*;

public class ModFeatures {

    public static final ConfiguredFeature<?, ?> DIAMOND_BLOCK = register("diamond_block", (ConfiguredFeature)((ConfiguredFeature)((ConfiguredFeature)Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.DIAMOND_BLOCK.getDefaultState(), 8)).maxHeight(128)).func_242728_a()).repeat(20));

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String id, ConfiguredFeature<FC, ?> feature) {
        return (ConfiguredFeature) Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(Main.MODID, id), feature);
    }

}
