package com.github.mimiknight.designpattern.type02.pattern05.case01;

/**
 * 外观模式 case01
 */
public class Main {
    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
    }
}
