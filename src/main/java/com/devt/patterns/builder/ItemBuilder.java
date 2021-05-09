package com.devt.patterns.builder;

public class ItemBuilder {

    private String name;
    private String description;

    public ItemBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ItemBuilder description(String description) {
        this.description = description;
        return this;
    }

    public Item build() {
        return new Item(name, description);
    }

}
