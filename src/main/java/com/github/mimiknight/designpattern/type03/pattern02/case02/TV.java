package com.github.mimiknight.designpattern.type03.pattern02.case02;

public class TV {

    private Boolean on = false;

    public TV() {
    }

    public void turnOn() {
        if (this.on) {
            System.out.println("电视已经启动了...");
            return;
        }
        this.on = true;
        System.out.println("打开电视");
    }

    public void turnOff() {
        if (!this.on) {
            System.out.println("电视还没有开启...");
            return;
        }
        this.on = false;
        System.out.println("关闭电视");
    }
}
