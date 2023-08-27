package com.github.mimiknight.designpattern.type02.pattern01.case01;

public class Voltage110V implements Voltage{
    private int voltage = 110;

    @Override
    public int output() {
        return this.voltage;
    }
}
