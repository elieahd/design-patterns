package com.devt.patterns.composite;

public class HRDepartment implements Department {

    private String name;

    public HRDepartment(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(name);
    }

}
