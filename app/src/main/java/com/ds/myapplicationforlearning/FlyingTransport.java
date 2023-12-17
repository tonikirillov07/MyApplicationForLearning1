package com.ds.myapplicationforlearning;

public class FlyingTransport extends Calculations implements MathOperations{
    private final int capacity;
    private final double maxSpeed;
    private final double fuelConsumption;
    private final String name;

    public FlyingTransport(int capacity, double maxSpeed, double fuelConsumption, String name) {
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calculateTimeForDistance(double distance) {
        return Calculations.calculateTime(distance, getMaxSpeed());
    }

    @Override
    public double calculateFuelValueForDistance(double distance) {
        return Calculations.calculateFuelValue(getFuelConsumption(), distance, getMaxSpeed());
    }
}
