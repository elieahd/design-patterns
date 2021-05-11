package com.devt.patterns.adapter;

public class MovableAdapterImpl implements MovableAdapter {
    private Movable movable;

    public MovableAdapterImpl(Movable movable) {
        this.movable = movable;
    }
    @Override
    public double getSpeed() {
        return movable.getSpeed() * 1.60934;
    }
}
