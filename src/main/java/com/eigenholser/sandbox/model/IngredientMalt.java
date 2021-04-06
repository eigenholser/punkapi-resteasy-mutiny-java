package com.eigenholser.sandbox.model;

public class IngredientMalt {
    private String name;
    private IngredientAmount amount;

    public String getName() {
        return name;
    }

    public IngredientMalt() {
    }

    public IngredientAmount getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "IngredientMalt{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
