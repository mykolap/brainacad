package com.brainacad.module2.lesson4;

public class GravityCalculator {

    public static final double ACCELERATION = -9.81;
    private double initialVelocity = 0;
    private double initialPosition = 0;

    public GravityCalculator() {
    }

    public GravityCalculator(double initialVelocity, double initialPosition) {
        this.initialVelocity = initialVelocity;
        this.initialPosition = initialPosition;
    }

    public double calcDist(double time) {
        return 0.5 * ACCELERATION * Math.pow(time, 2.0) + initialVelocity * time + initialPosition;
    }

}
