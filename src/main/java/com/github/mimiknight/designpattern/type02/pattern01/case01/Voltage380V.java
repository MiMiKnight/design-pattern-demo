package com.github.mimiknight.designpattern.type02.pattern01.case01;

public class Voltage380V implements Voltage{
    private int voltage = 380;

    @Override
    public int output() {
        return this.voltage;
    }
}
