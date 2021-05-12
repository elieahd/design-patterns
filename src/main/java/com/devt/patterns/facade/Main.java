package com.devt.patterns.facade;

public class Main {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
        shapeMaker.drawCircle();
    }

}
