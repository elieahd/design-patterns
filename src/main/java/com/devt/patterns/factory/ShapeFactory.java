package com.devt.patterns.factory;

public class ShapeFactory {

    public Shape get(String type) {
        switch (type) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                throw new UnsupportedOperationException();
        }
    }

}
