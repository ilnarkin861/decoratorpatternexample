package com.company;

public class ShapeBorderDecorator extends ShapeDecorator {

    public ShapeBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorder(decoratedShape);
    }

    private void setBorder(Shape decoratedShape){
        System.out.println("Set Border");
    }
}
