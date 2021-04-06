package com.eigenholser.sandbox.model;

public class Temp {
    private String unit;
    private Integer value;

    public String getUnit() {
        return unit;
    }

    public Temp() {
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "unit='" + unit + '\'' +
                ", value=" + value +
                '}';
    }
}
