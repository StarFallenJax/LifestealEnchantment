package com.example.items;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
//import net.minecraft.entity.attribute.EntityAttributes;
//import net.minecraft.entity.effect.StatusEffectInstance;
//import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class LifestealEnchantment extends Enchantment {
    public LifestealEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) {
        return 10 * level;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) { // Called when player attacks a mob

        if (user instanceof PlayerEntity player) {
            if (level == 1) {
                player.heal(0.5F);
            }else if (level == 2) {
                player.heal(1.0F);
            }else if (level == 3) {
                player.heal(1.5F);
            }
            super.onTargetDamaged(user, target, level);

//        if(user instanceof PlayerEntity) {
//            ((PlayerEntity) user).addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 100 * 1 * level, level - 1));
//        }

            super.onTargetDamaged(user, target, level);

        }
    }
}