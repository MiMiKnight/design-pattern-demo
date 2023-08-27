package com.github.mimiknight.designpattern.type02.pattern01.case01;

public class Voltage5V implements Voltage{
    private int voltage = 5;

    @Override
    public int output() {
        return this.voltage;
    }
}
