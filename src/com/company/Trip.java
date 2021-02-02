package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Trip {

    private String country;
    private double duration;
    private String landmarks;
    private int gasStops;

    ArrayList<Trip> tripList = new ArrayList<>();

    public Trip(){}



    public Trip(String country, double duration, String landmarks, int gasStops){
        this.country = country;
        this.duration = duration;
        this.landmarks = landmarks;
        this.gasStops = gasStops;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "country='" + country + '\'' +
                ", duration=" + duration +
                ", landmarks='" + landmarks + '\'' +
                ", gasStops=" + gasStops +
                '}';
    }

    void createTrip(){
        String country;
        double duration;
        String landmarks;
        int gasStops;
        int tempatureHot;
        String snowType;
        int tempatureCold;
        boolean clearWater;

        Scanner scan = new Scanner(System.in);
        System.out.println("Vælg om det skal være en strandferie(1) eller skiferie (2)");
        int tripType = scan.nextInt();
        if (tripType == 1) {
            System.out.println("Skriv land");
            country = scan.nextLine();
            System.out.println("Skriv lænden af turen(med kommatal)");
            duration = scan.nextDouble();
            System.out.println("Skriv landmarks du vil se");
            landmarks = scan.nextLine();
            System.out.println("Skriv hvor mange gange der skal tankes op på vejen");
            gasStops = scan.nextInt();
            System.out.println("Skriv den forventet temperatur");
            tempatureHot = scan.nextInt();
            System.out.println("Er vandet klart? (true & false)");
            clearWater = scan.nextBoolean();
            BeachTrip beachTrip = new BeachTrip(country, duration, landmarks, gasStops, tempatureHot, clearWater);
            tripList.add(beachTrip);
        } else {
            System.out.println("Skriv land");
            country = scan.nextLine();
            System.out.println("Skriv lænden af turen(med kommatal)");
            duration = scan.nextDouble();
            System.out.println("Skriv landmarks du vil se");
            landmarks = scan.nextLine();
            System.out.println("Skriv hvor mange gange der skal tankes op på vejen");
            gasStops = scan.nextInt();
            System.out.println("Skriv den forventet temperatur");
            tempatureCold = scan.nextInt();
            System.out.println("Skriv snetypen");
            snowType = scan.nextLine();
            SkiTrip skiTrip = new SkiTrip(country, duration, landmarks, gasStops, tempatureCold, snowType);
            tripList.add(skiTrip);
        }
    }

    void displayTrips() {
        for (Trip rejser:tripList) {
            System.out.println(rejser.toString());
        }
    }
}
