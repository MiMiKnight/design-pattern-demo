package com.github.mimiknight.designpattern.type02.pattern02.case01;

public enum ColorType {

    /**
     * 红色
     */
    RED("red"),
    /**
     * 蓝色
     */
    BLUE("blue"),
    /**
     * 黄色
     */
    YELLOW("yellow"),
    /**
     * 绿色
     */
    GREEN("green");

    private final String name;

    ColorType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
