package net.sirburk.dungeonsunleashed.datagen;

import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.common.Mod;
import net.sirburk.dungeonsunleashed.DungeonsUnleashed;
import net.sirburk.dungeonsunleashed.block.ModBlocks;

import java.util.function.Consumer;


public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {




        //Cracked Block Smelting Recipes
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICKS.get(), 0.1F, 200)
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "cracked_granite_bricks"));

        //Blocks
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE.get())
                .group("seaweed_encrusted_cut_polished_granite")
                .requires(ModBlocks.CUT_POLISHED_GRANITE.get())
                .requires(Blocks.SEAGRASS)
                .unlockedBy("has_seagrass", has(Blocks.SEAGRASS))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "seaweed_encrusted_cut_polished_granite_from_seagrass"));

//granite bricks from polished granite crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS.get(),4)
                .pattern("AA ")
                .pattern("AA ")
                .define('A', Blocks.POLISHED_GRANITE)
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer);
//granite brick stairs from granite bricks crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.GRANITE_BRICKS.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer);

//granite bricks from granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_bricks_from_stonecutting_from_granite"));
//granite bricks from polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_bricks_from_stonecutting_from_polished_granite"));

//granite brick stairs from granite bricks stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_brick_stairs_from_stonecutting"));
//granite brick stairs from granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_brick_stairs_from_stonecutting_from_granite"));
//granite brick stairs from polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_brick_stairs_from_stonecutting_from_polished_granite"));

//granite brick slab from granite bricks crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.GRANITE_BRICKS.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer);
//granite brick slab from granite bricks stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_brick_slab_from_stonecutting"));
//granite brick slab from granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_brick_slab_from_stonecutting_from_granite"));
//granite brick slab from polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_brick_slab_from_stonecutting_from_polished_granite"));

//granite brick wall from granite bricks crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.GRANITE_BRICKS.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer);
//granite brick wall from granite bricks stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_brick_wall_from_stonecutting"));
//granite brick wall from granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_brick_wall_from_stonecutting_from_granite"));
//granite brick wall from polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_brick_wall_from_stonecutting_from_polished_granite"));

//cut polished granite wall from cut polished granite crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_GRANITE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.CUT_POLISHED_GRANITE.get())
                .unlockedBy("has_cut_polished_granite", has(ModBlocks.CUT_POLISHED_GRANITE.get()))
                .save(consumer);
//cut polished granite stairs from cut polished granite crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_GRANITE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.CUT_POLISHED_GRANITE.get())
                .unlockedBy("has_cut_polished_granite", has(ModBlocks.CUT_POLISHED_GRANITE.get()))
                .save(consumer);
//cut polished granite from polished granite slab crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_GRANITE.get(),1)
                .pattern("A  ")
                .pattern("A  ")
                .define('A', Blocks.POLISHED_GRANITE_SLAB)
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer);

//cut polished granite from granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_GRANITE.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "cut_polished_granite_from_stonecutting_from_granite"));
//cut polished granite from polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_GRANITE.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "cut_polished_granite_from_stonecutting_from_polished_granite"));

//cut polished granite wall from polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_GRANITE_WALL.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "cut_polished_granite_wall_from_stonecutting_from_polished_granite"));
//cut polished granite wall from granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_GRANITE_WALL.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "cut_polished_granite_wall_from_stonecutting_from_granite"));
//cut polished granite wall from cut polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_POLISHED_GRANITE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_GRANITE_WALL.get())
                .unlockedBy("has_cut_polished_granite", has(ModBlocks.CUT_POLISHED_GRANITE.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "cut_polished_granite_wall_from_stonecutting_from_cut_polished_granite"));

//cut polished granite slab from polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_GRANITE_SLAB.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "cut_polished_granite_slab_from_stonecutting_from_polished_granite"));
//cut polished granite slab from granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_GRANITE_SLAB.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "cut_polished_granite_slab_from_stonecutting_from_granite"));
//cut polished granite slab from cut polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_POLISHED_GRANITE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_GRANITE_SLAB.get())
                .unlockedBy("has_cut_polished_granite", has(ModBlocks.CUT_POLISHED_GRANITE.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "cut_polished_granite_slab_from_stonecutting_from_cut_polished_granite"));

//cut polished granite stairs from polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_GRANITE_STAIRS.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "cut_polished_granite_stairs_from_stonecutting_from_polished_granite"));
//cut polished granite stairs from granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_GRANITE_STAIRS.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "cut_polished_granite_stairs_from_stonecutting_from_granite"));
//cut polished granite stairs from cut polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CUT_POLISHED_GRANITE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_POLISHED_GRANITE_STAIRS.get())
                .unlockedBy("has_cut_polished_granite", has(ModBlocks.CUT_POLISHED_GRANITE.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "cut_polished_granite_stairs_from_stonecutting_from_cut_polished_granite"));

//cracked granite brick stairs from cracked granite bricks stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_STAIRS.get())
                .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "cracked_granite_brick_stairs_from_stonecutting"));
//cracked granite brick stair from cracked granite bricks crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_GRANITE_BRICKS.get())
                .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                .save(consumer);

//cracked granite brick slab from cracked granite bricks stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB.get(),2)
                .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "cracked_granite_brick_slab_from_stonecutting"));
//cracked granite brick slab from cracked granite bricks crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_SLAB.get(), 6)
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_GRANITE_BRICKS.get())
                .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                .save(consumer);

//cracked granite brick wall from granite bricks crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.CRACKED_GRANITE_BRICKS.get())
                .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                .save(consumer);
//cracked granite brick wall from granite bricks stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.CRACKED_GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICK_WALL.get())
                .unlockedBy("has_cracked_granite_bricks", has(ModBlocks.CRACKED_GRANITE_BRICKS.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "cracked_granite_brick_wall_from_stonecutting"));

//seaweed encrusted cut polished granite stairs from seaweed encrusted cut polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE_STAIRS.get())
                .unlockedBy("has_seaweed_encrusted_cut_polished_granite", has(ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "seaweed_encrusted_cut_polished_granite_stairs_from_stonecutting"));
//seaweed encrusted cut polished granite stairs from seaweed encrusted cut polished granite crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE_STAIRS.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE.get())
                .unlockedBy("has_seaweed_encrusted_cut_polished_granite", has(ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE.get()))
                .save(consumer);

//seaweed encrusted cut polished granite slab from seaweed encrusted cut polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE_SLAB.get(),2)
                .unlockedBy("has_seaweed_encrusted_cut_polished_granite", has(ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "seaweed_encrusted_cut_polished_granite_slab_from_stonecutting"));
//seaweed encrusted cut polished granite slab from seaweed encrusted cut polished granite crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE_SLAB.get(), 6)
                .pattern("AAA")
                .define('A', ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE.get())
                .unlockedBy("has_seaweed_encrusted_cut_polished_granite", has(ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE.get()))
                .save(consumer);

//seaweed encrusted cut polished granite wall from seaweed encrusted cut polished granite crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE.get())
                .unlockedBy("has_seaweed_encrusted_cut_polished_granite", has(ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE.get()))
                .save(consumer);
//seaweed encrusted cut polished granite wall from seaweed encrusted cut polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE_WALL.get())
                .unlockedBy("has_seaweed_encrusted_cut_polished_granite", has(ModBlocks.SEAWEED_ENCRUSTED_CUT_POLISHED_GRANITE.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "seaweed_encrusted_cut_polished_granite_wall_from_stonecutting"));

//granite tiles from granite bricks crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE.get(),4)
                .pattern("AA ")
                .pattern("AA ")
                .define('A', ModBlocks.GRANITE_BRICKS.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer);
//granite tiles from granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_tiles_from_stonecutting_from_granite"));
//granite tiles from granite bricks stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_tiles_from_stonecutting_from_granite_bricks"));
//granite tiles from polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_tiles_from_stonecutting_from_polished_granite"));

//granite tile wall from polished granite tile crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_WALL.get(),6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.GRANITE_TILE.get())
                .unlockedBy("has_granite_tile", has(ModBlocks.GRANITE_TILE.get()))
                .save(consumer);
//granite tile wall from granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_WALL.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_tile_wall_from_stonecutting_from_granite"));
//granite tile wall from granite bricks stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_WALL.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_tile_wall_from_stonecutting_from_granite_bricks"));
//granite tile wall from polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_WALL.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_tile_wall_from_stonecutting_from_polished_granite"));
//granite tile wall from polished granite tile stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_TILE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_WALL.get())
                .unlockedBy("has_granite_tile", has(ModBlocks.GRANITE_TILE.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_tile_wall_from_stonecutting_from_granite_tile"));

//granite tile slab from polished granite tile crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_SLAB.get(),6)
                .pattern("AAA")
                .define('A', ModBlocks.GRANITE_TILE.get())
                .unlockedBy("has_granite_tile", has(ModBlocks.GRANITE_TILE.get()))
                .save(consumer);
//granite tile slab from granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_SLAB.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_tile_slab_from_stonecutting_from_granite"));
//granite tile slab from granite bricks stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_SLAB.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_tile_slab_from_stonecutting_from_granite_bricks"));
//granite tile slab from polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_SLAB.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_tile_slab_from_stonecutting_from_polished_granite"));
//granite tile slab from polished granite tile stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_TILE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_SLAB.get())
                .unlockedBy("has_granite_tile", has(ModBlocks.GRANITE_TILE.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_tile_slab_from_stonecutting_from_granite_tile"));

//granite tile stair from polished granite tile crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_STAIR.get(),4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.GRANITE_TILE.get())
                .unlockedBy("has_granite_tile", has(ModBlocks.GRANITE_TILE.get()))
                .save(consumer);
//granite tile stair from granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_STAIR.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_tile_stair_from_stonecutting_from_granite"));
//granite tile stair from granite bricks stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_STAIR.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_tile_stair_from_stonecutting_from_granite_bricks"));
//granite tile stair from polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_STAIR.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_tile_stair_from_stonecutting_from_polished_granite"));
//granite tile stair from granite tile stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_TILE.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_TILE_STAIR.get())
                .unlockedBy("has_granite_tile", has(ModBlocks.GRANITE_TILE.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "granite_tile_stair_from_stonecutting_from_granite_tile"));

//chiseled granite
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE.get(),1)
                .pattern("A  ")
                .pattern("A  ")
                .define('A', ModBlocks.GRANITE_BRICK_SLAB.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer);
//chiseled granite from granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE.get())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "chiseled_granite_from_stonecutting_from_granite"));
//chiseled granite from granite bricks stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModBlocks.GRANITE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE.get())
                .unlockedBy("has_granite_bricks", has(ModBlocks.GRANITE_BRICKS.get()))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "chiseled_granite_from_stonecutting_from_granite_bricks"));
//chiseled granite from polished granite stonecutting
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.POLISHED_GRANITE), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRANITE.get())
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(consumer, new ResourceLocation(DungeonsUnleashed.MODID, "chiseled_granite_from_stonecutting_from_polished_granite"));






















        /*ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POLISHED_DEEPSLATE_BUTTON.get())
                .requires(Blocks.POLISHED_DEEPSLATE)
                .unlockedBy("has_polished_deepslate", has(Blocks.POLISHED_DEEPSLATE))
                .save(consumer);*/

    }
}
