//package com.example.items;
//
//import net.minecraft.client.item.TooltipContext;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.sound.SoundEvents;
//import net.minecraft.text.Text;
//import net.minecraft.util.Formatting;
//import net.minecraft.util.Hand;
//import net.minecraft.util.TypedActionResult;
//import net.minecraft.world.World;
//
//import java.util.List;
//
//public class NewItem extends Item {
//
//    public NewItem(Settings settings) {
//        super(settings);
//
//    }
//
//    @Override
//    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
//
//        playerEntity.setVelocity(playerEntity.getVelocity().x,0.5,playerEntity.getVelocity().z);
//        playerEntity.playSound(SoundEvents.BLOCK_AMETHYST_BLOCK_PLACE, 1.0F, 1.0F);
//
//        return TypedActionResult.success(playerEntity.getStackInHand(hand));
//    }
//
//    @Override
//    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
//
//        // formatted grey text
//        tooltip.add(Text.translatable("NewItem").formatted(Formatting.GRAY));
//    }
//
//}
