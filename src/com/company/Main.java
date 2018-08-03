package com.company;

public class Main {

    public static void main(String[] args) {
        Shape shape = new ShapeColorDecorator(new ShapeBorderDecorator(new Circle()));
        shape.draw();

    }
}
