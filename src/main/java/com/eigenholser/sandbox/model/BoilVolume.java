package com.eigenholser.sandbox.model;

public class BoilVolume {
    private Integer value;
    private String unit;

    public BoilVolume() {}

    public Integer getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "BoilVolume{" +
                "value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }
}
