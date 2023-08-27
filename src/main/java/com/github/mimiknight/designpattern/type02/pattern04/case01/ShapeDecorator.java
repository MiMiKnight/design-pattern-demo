package com.github.mimiknight.designpattern.type02.pattern04.case01;

/**
 * 装饰器抽象类
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    protected ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }

}
