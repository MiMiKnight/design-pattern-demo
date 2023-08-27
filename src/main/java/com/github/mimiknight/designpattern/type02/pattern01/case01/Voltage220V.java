package com.github.mimiknight.designpattern.type02.pattern01.case01;

public class Voltage220V implements Voltage{
    private int voltage = 220;

    @Override
    public int output() {
        return this.voltage;
    }
}
