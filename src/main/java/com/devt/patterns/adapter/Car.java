package com.devt.patterns.adapter;

public class Car implements Movable {
    private double speed;
    public Car(double speed) {
        this.speed = speed;
    }
    @Override
    public double getSpeed() {
        return speed;
    }
}
