package com.ds.myapplicationforlearning;

import java.text.DecimalFormat;

public abstract class Calculations {
    public static double calculateFuelValue(double fuelConsumption, double distance, double maxSpeed) {
        return fuelConsumption * (distance / maxSpeed);
    }

    public static double calculateTime(double distance, double maxSpeed){
        return distance / maxSpeed;
    }

    public static double convertTonsToKgs(double tonsValue){
        return tonsValue * 1000;
    }

    public static double roundNumber(double number){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(number));
    }
}
