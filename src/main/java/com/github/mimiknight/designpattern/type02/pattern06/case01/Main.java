package com.github.mimiknight.designpattern.type02.pattern06.case01;

public class Main {
    public static void main(String[] args) {

        String red = "red";
        Shape redCircle = ShapeFactory.getCircle(red);
        Shape redCircle2 = ShapeFactory.getCircle(red);

        redCircle.draw();
        redCircle2.draw();

    }
}
