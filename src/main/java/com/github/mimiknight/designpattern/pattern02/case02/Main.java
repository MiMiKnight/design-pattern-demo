package com.github.mimiknight.designpattern.pattern02.case02;

public class Main {

    public static void main(String[] args) {

        Shape circle = ShapeFactory.getShape(Circle.class);
        circle.draw();

        Shape rectangle = ShapeFactory.getShape(Rectangle.class);
        rectangle.draw();

    }
}
