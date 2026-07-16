package com.creational.builder.core;

import com.creational.builder.protocols.MealBuilder;
import com.creational.builder.core.meals.Rice;
import com.creational.builder.core.meals.Beans;
import com.creational.builder.core.meals.Meat;
import com.creational.builder.core.meals.Salad;
import com.creational.builder.core.meals.Beverage;
import com.creational.builder.core.meals.Dessert;

public class MainDishBuilder implements MealBuilder {

    private MealBox meal = new MealBox();

    public MainDishBuilder reset(){
        this.meal = new MealBox();
        return this;
    }

    @Override
    public MainDishBuilder makeMeal() {
        var rice = new Rice("Normal Rice", 5);
        var beans = new Beans("Normal Beans", 8);
        var meat = new Meat("Beef Meat", 10);
        var salad = new Salad("Salad", 5);

        this.meal.add(rice, beans, meat, salad);
        return this;
    }

    public MainDishBuilder makeBeverage() {
        var beverage = new Beverage("Lemon juice", 5);
        this.meal.add(beverage);
        return this;
    }

    public MainDishBuilder makeDessert() {
        var dessert = new Dessert("Pudim", 15);
        this.meal.add(dessert);
        return this;
    }

    public MealBox getMeal(){
        return this.meal;
    }

    public double getPrice(){
        return this.meal.getPrice();
    }
}
