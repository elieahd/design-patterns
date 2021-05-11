package com.devt.patterns.composite;

public class Main {

    public static void main(String[] args) {
        HeadDepartment headDepartment = new HeadDepartment("HeadDepartment");
        headDepartment.addDepartment(new HRDepartment("HRDepartment"));
        headDepartment.addDepartment(new SalesDepartment("SalesDepartment"));
        headDepartment.printName();
    }

}
