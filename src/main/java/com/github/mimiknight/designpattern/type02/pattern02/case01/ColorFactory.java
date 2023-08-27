package com.github.mimiknight.designpattern.type02.pattern02.case01;

public class ColorFactory {

    private ColorFactory() {
    }

    public static Color getColor(ColorType type) {
        Color color;
        switch (type) {
            case RED:
                color = new RedColor();
                break;
            case BLUE:
                color = new BlueColor();
                break;
            case GREEN:
                color = new GreenColor();
                break;
            default:
                throw new IllegalArgumentException("argument invalid");
        }
        return color;
    }
}
