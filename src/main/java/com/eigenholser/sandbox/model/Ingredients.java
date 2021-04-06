package com.eigenholser.sandbox.model;

import java.util.List;

public class Ingredients {
    private List<IngredientMalt> malt;
    private List<IngredientHops> hops;
    private String yeast;

    public Ingredients() {
    }

    public List<IngredientMalt> getMalt() {
        return malt;
    }

    public List<IngredientHops> getHops() {
        return hops;
    }

    public String getYeast() {
        return yeast;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "malt=" + malt +
                ", hops=" + hops +
                ", yeast='" + yeast + '\'' +
                '}';
    }
}
