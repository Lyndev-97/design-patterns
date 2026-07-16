package com.creational.builder.core.meals;

import com.creational.builder.protocols.MealComposite;

public abstract class AbstractMeal implements MealComposite {
    private String name;
    private double price;

    public AbstractMeal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " { name: '" + this.name + "', price: " + this.price + " }";
    }
}
