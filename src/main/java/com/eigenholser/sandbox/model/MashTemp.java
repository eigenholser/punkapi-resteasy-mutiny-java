package com.eigenholser.sandbox.model;

public class MashTemp {
    private Integer duration;
    private Temp temp;

    public Integer getDuration() {
        return duration;
    }

    public MashTemp() {
    }

    public Temp getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "MashTemp{" +
                "duration=" + duration +
                ", temp=" + temp +
                '}';
    }
}
