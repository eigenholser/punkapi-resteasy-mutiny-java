package com.eigenholser.sandbox.model;

import java.util.List;

public class Method {
    private Temp fermentation;
    private List<MashTemp> mash_temp;
    private String twist;

    public Method() {
    }

    public Temp getFermentation() {
        return fermentation;
    }

    public List<MashTemp> getMash_temp() {
        return mash_temp;
    }

    public String getTwist() {
        return twist;
    }

    @Override
    public String toString() {
        return "Method{" +
                "fermentation=" + fermentation +
                ", mash_temp=" + mash_temp +
                ", twist='" + twist + '\'' +
                '}';
    }
}
