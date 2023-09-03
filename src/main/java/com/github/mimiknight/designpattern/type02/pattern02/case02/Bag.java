package com.github.mimiknight.designpattern.type02.pattern02.case02;

/**
 * 包抽象类
 */
public abstract class Bag {

    protected  Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract String getName();
}
