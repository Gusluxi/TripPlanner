package com.company;

public class BeachTrip extends Trip {
    private int tempature;
    private boolean clearWater;

    public BeachTrip(String country, double duration, String landmarks, int gasStops, int tempature, boolean clearWater) {
        super(country, duration, landmarks, gasStops);
        this.tempature = tempature;
        this.clearWater = clearWater;
    }

    @Override
    public String toString() {
        return "BeachTrip{" +
                "tempature=" + tempature +
                ", clearWater=" + clearWater +
                '}';
    }


}
