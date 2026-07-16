package com.creational.builder.core;

import com.creational.builder.core.meals.Beans;
import com.creational.builder.core.meals.Rice;
import com.creational.builder.core.meals.Salad;
import com.creational.builder.protocols.MealBuilder;
import com.creational.builder.protocols.MealComposite;

public class VeganDishBuilder implements MealBuilder {

    private MealBox mealBox = new MealBox();

    @Override
    public VeganDishBuilder makeMeal() {
        var rice = new Rice("Brown Rice", 5);
        var beans = new Beans("Beans", 7);
        var salad = new Salad("Salad", 5);

        this.mealBox.add(rice, beans, salad);
        return this;
    }

    public VeganDishBuilder reset(){
        this.mealBox = new MealBox();
        return this;
    }

    public MealBox getMeal(){
        return this.mealBox;
    }

    public double getPrice(){
        return this.mealBox.getPrice();
    }

}
