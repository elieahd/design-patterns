package com.devt.patterns.strategy;

public class SpringDiscounter implements Discounter {
    @Override
    public double apply(double amount) {
        return amount * 0.9;
    }
}
