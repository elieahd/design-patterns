package com.devt.patterns.facade;

public class ShapeMaker {

    private Shape rectangle;
    private Shape square;
    private Shape circle;

    public ShapeMaker() {
        rectangle = new Rectangle();
        square = new Square();
        circle = new Circle();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawCircle() {
        circle.draw();
    }

}
