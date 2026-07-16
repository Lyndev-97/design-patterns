package com.creational.builder.core;

import com.creational.builder.protocols.MealComposite;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MealBox implements MealComposite {

    private final List<MealComposite> children = new ArrayList<>();

    @Override
    public double getPrice() {
        /*
        double price = 0;
        for (MealComposite child : children) {
            price += child.getPrice();
        }
        return price;
        */
        //return children.stream().mapToDouble(child -> child.getPrice()).sum();
        return children.stream().mapToDouble(MealComposite::getPrice).sum();

    }

    public void add(MealComposite... meals) {

        /*
        for (MealComposite ingredient : meals) {
            this.children.add(ingredient);
        }
        */

        this.children.addAll(Arrays.asList(meals));

    }

    @Override
    public String toString() {
        return "MealBox { children: " + children + " }";
    }
}
