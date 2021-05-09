package com.devt.patterns.builder;

public class Main {

    public static void main(String[] args) {
        Item item = new ItemBuilder()
                .name("item name")
                .description("item description")
                .build();
    }

}
