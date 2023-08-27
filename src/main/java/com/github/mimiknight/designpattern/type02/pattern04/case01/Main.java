package com.github.mimiknight.designpattern.type02.pattern04.case01;

/**
 * 通过装饰模式的装饰类增强了 Shape接口的draw()方法
 * <p>
 * 实现步骤：
 * 1.定义被装饰对象
 */
public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Rectangle rectangle = new Rectangle();

        RedShapeDecorator redCircle = new RedShapeDecorator(circle);
        RedShapeDecorator redRectangle = new RedShapeDecorator(rectangle);

        BlueShapeDecorator blueCircle = new BlueShapeDecorator(circle);
        BlueShapeDecorator blueRectangle = new BlueShapeDecorator(rectangle);

        circle.draw();
        redCircle.draw();
        blueCircle.draw();

        rectangle.draw();
        redRectangle.draw();
        blueRectangle.draw();

    }
}
