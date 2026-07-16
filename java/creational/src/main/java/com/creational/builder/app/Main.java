package com.creational.builder.app;

import com.creational.builder.core.MainDishBuilder;
import com.creational.builder.core.VeganDishBuilder;

public class Main {
    public static void main(String[] args) {

        var mainDish = new MainDishBuilder().makeMeal().makeBeverage().makeDessert();
        System.out.println("Done main Dish: " + mainDish.getMeal());
        System.out.println("Main Dish Price: " + mainDish.getPrice());
        System.out.println("==========================================================");
        mainDish.reset();
        mainDish = new MainDishBuilder().makeMeal();
        System.out.println("Done main Dish: " + mainDish.getMeal());
        System.out.println("Main Dish Price: " + mainDish.getPrice());
        System.out.println("==========================================================");
        mainDish.reset();

        var veganDish = new VeganDishBuilder().makeMeal();
        System.out.println("Done Vegan Dish: " + veganDish.getMeal());
        System.out.println("Vegan Dish Price: " + veganDish.getPrice());

    }
}
