package com.devt.patterns.adapter;

public class Main {

    public static void main(String[] args) {
        Movable car = new Car();
        final double speedInMPH = car.getSpeed();
        MovableAdapter carAdapter = new MovableAdapterImpl(car);
        final double speedInKMH = carAdapter.getSpeed();
    }
}
