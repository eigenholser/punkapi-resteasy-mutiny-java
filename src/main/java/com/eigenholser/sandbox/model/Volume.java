package com.eigenholser.sandbox.model;

public class Volume {
    private Integer value;
    private String unit;

    public Integer getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public Volume() {
    }

    @Override
    public String toString() {
        return "Volume{" +
                "value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }
}
