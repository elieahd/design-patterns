package com.devt.patterns.strategy;

public class SummerDiscounter implements Discounter {
    @Override
    public double apply(double amount) {
        return amount * 0.8;
    }
}
