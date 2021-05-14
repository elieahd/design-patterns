package com.devt.patterns.strategy;

import javax.naming.Context;

public class Main {

    public static void main(String[] args) {
        final DiscountContext context = new DiscountContext(new SpringDiscounter());
        final double amountAfterDiscount = context.apply(100);
    }

}
