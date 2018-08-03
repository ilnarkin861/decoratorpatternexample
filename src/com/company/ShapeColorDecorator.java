package com.company;

public class ShapeColorDecorator extends ShapeDecorator {

    public ShapeColorDecorator(Shape decoratedShape) {
        super(decoratedShape);

    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setColor(decoratedShape);
    }

    private void setColor(Shape decoratedShape){
        System.out.println("Set Color");
    }
}
