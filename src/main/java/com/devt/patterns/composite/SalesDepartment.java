package com.devt.patterns.composite;

public class SalesDepartment implements Department {
    private String name;

    public SalesDepartment(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(name);
    }

}
