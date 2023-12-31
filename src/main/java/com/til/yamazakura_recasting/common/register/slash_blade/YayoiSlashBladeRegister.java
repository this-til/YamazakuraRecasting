package com.til.yamazakura_recasting.common.register.slash_blade;

import com.til.glowing_fire_glow.common.register.VoluntarilyAssignment;
import com.til.glowing_fire_glow.common.register.VoluntarilyRegister;
import com.til.glowing_fire_glow.common.util.ListUtil;
import com.til.glowing_fire_glow.common.util.MapUtil;
import com.til.recasting.common.data.IRecipeInItemPack;
import com.til.recasting.common.data.IResultPack;
import com.til.recasting.common.data.SlashBladePack;
import com.til.recasting.common.register.recipe.SlashBladeRecipeSerializerRegister;
import com.til.recasting.common.register.slash_blade.SlashBladeRegister;
import com.til.recasting.common.register.slash_blade.instance.original.NamelessSlashBladeRegister;
import mods.flammpfeil.slashblade.init.SBItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

import java.awt.*;

@VoluntarilyRegister
public class YayoiSlashBladeRegister extends SlashBladeRegister {

    @Override
    protected void defaultItemStackConfig(ItemStack itemStack) {
        super.defaultItemStackConfig(itemStack);
        slashBladePack.getSlashBladeState().setBaseAttackModifier(6);
        slashBladePack.getSlashBladeState().setEffectColor(new Color(16025767));
    }

    @VoluntarilyRegister
    public static class YayoiSlashBladeRecipeRegister extends SlashBladeRecipeSerializerRegister.SlashBladeRecipeRegister {
        @VoluntarilyAssignment
        protected YayoiSlashBladeRegister yayoiSlashBladeRegister;
        @VoluntarilyAssignment
        protected NamelessSlashBladeRegister namelessSlashBladeRegister;

        @Override
        protected SlashBladeRecipeSerializerRegister.SlashBladeRecipeRecipePack defaultConfigSlashBladeRecipeRecipePack() {
            SlashBladePack namelessSlashBlade = namelessSlashBladeRegister.getSlashBladePack();
            namelessSlashBlade.getSlashBladeState().setKillCount(100);
            namelessSlashBlade.getSlashBladeState().setRefine(30);

            return new SlashBladeRecipeSerializerRegister.SlashBladeRecipeRecipePack(
                    ListUtil.of(
                            "  G",
                            " G ",
                            "VD "
                    ),
                    MapUtil.of(
                            "G", new IRecipeInItemPack.OfIngredient(Ingredient.fromItems(SBItems.proudsoul_ingot)),
                            "D", new IRecipeInItemPack.OfIngredient(Ingredient.fromItems(Items.PINK_TULIP)),
                            "V", new IRecipeInItemPack.OfSlashBlade(namelessSlashBlade)
                    ),
                    "V",
                    new IResultPack.OfSlashBladeRegister(yayoiSlashBladeRegister)
            );
        }
    }
}
