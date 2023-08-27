package com.github.mimiknight.designpattern.type02.pattern04.case01;

/**
 * 装饰器的具体实现类
 */
public class BlueShapeDecorator extends ShapeDecorator{

    protected BlueShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Blue");
    }
}
