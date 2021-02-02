package com.company;

public class SkiTrip extends Trip {
    private int tempature;
    private String snowType;




    public SkiTrip(String country, double duration, String landmarks, int gasStops, int tempature, String snowType) {
        super(country, duration, landmarks, gasStops);
        this.tempature = tempature;
        this.snowType = snowType;
    }

    @Override
    public String toString() {
        return "SkiTrip{" +
                "tempature=" + tempature +
                ", snowType='" + snowType + '\'' +
                '}';
    }
}
