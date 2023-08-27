package com.github.mimiknight.designpattern.type02.pattern02.case01;

public abstract class Color {

    private final ColorType type;

    protected Color(ColorType type) {
        this.type = type;
    }

    public ColorType getType() {
        return type;
    }
}
