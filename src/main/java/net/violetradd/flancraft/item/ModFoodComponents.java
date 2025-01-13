package net.violetradd.flancraft.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CARAMEL = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.3f)
            .snack().build();

    public static final FoodComponent CUSTARD = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.3f)
            .snack().build();

    public static final FoodComponent FLAN = new FoodComponent.Builder()
            .nutrition(6)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 6000), 0.50f)
            .saturationModifier(1.5f).build();
}
