package com.devt.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

    private String name;
    private List<Department> departments;

    public HeadDepartment(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    @Override
    public void printName() {
        departments.forEach(Department::printName);;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

}
