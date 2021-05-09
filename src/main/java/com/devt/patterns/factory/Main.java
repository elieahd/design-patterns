package com.devt.patterns.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.get("CIRCLE");
        circle.draw();
        Shape rectangle = factory.get("RECTANGLE");
        rectangle.draw();
    }
}
