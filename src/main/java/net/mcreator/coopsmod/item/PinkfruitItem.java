
package net.mcreator.coopsmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.coopsmod.CoopsmodModElements;

@CoopsmodModElements.ModElement.Tag
public class PinkfruitItem extends CoopsmodModElements.ModElement {
	@ObjectHolder("coopsmod:pinkfruit")
	public static final Item block = null;
	public PinkfruitItem(CoopsmodModElements instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64)
					.food((new Food.Builder()).hunger(4).saturation(0.7f).setAlwaysEdible().build()));
			setRegistryName("pinkfruit");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 20;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
