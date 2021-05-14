package com.devt.patterns.strategy;

public class DiscountContext {

    private Discounter discounter;

    public DiscountContext(Discounter discounter) {
        this.discounter = discounter;
    }

    public double apply(double amount) {
        return discounter.apply(amount);
    }
}
