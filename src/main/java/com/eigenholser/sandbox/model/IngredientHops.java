package com.eigenholser.sandbox.model;

public class IngredientHops {
    private String name;
    private String attribute;
    private String add;
    private IngredientAmount amount;

    public IngredientHops() {
    }

    public String getName() {
        return name;
    }

    public String getAttribute() {
        return attribute;
    }

    public String getAdd() {
        return add;
    }

    public IngredientAmount getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "IngredientHops{" +
                "name='" + name + '\'' +
                ", attribute='" + attribute + '\'' +
                ", add='" + add + '\'' +
                ", amount=" + amount +
                '}';
    }
}
