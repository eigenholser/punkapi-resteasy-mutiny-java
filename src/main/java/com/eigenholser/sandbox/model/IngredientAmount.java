package com.eigenholser.sandbox.model;

public class IngredientAmount {
    private Float value;
    private String unit;

    public IngredientAmount() {
    }

    public Float getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "IngredientAmount{" +
                "value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }
}
