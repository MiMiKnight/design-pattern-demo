package com.github.mimiknight.designpattern.type02.pattern06.case01;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (null == circle) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
