package com.tobias.corejava.exercises.ch02;

public class Car {
    private int xPos = 0;
    private double gasTank = 0.0;
    private double fuelEfficiency = 1.0;

    public Car() {

    }

    public Car(int xPos) {
        this.xPos = xPos;
    }

    public Car(int xPos, double gasTank, double fuelEfficiency) {
        this.xPos = xPos;
        this.gasTank = gasTank;
        this.fuelEfficiency = fuelEfficiency;
    }


    public void drive(int xDirection) {
        this.xPos += xDirection;
        this.gasTank -= xDirection / fuelEfficiency;
    }

    public void addGas(double gasVol) {
        this.gasTank += gasVol;
    }

    public int getxPos() {
        return xPos;
    }

    public double getGasTank() {
        return gasTank;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public String toString() {
        return String.format("Car = {x: %s, tank: %s, FC: %s}", xPos, gasTank, fuelEfficiency);
    }


}
