package com.github.mimiknight.designpattern.type02.pattern01.case02;

public enum VoltageType {

    /**
     * 交流5v
     */
    DC5V(5),
    /**
     * 交流12v
     */
    DC12V(12),
    /**
     * 交流18v
     */
    DC18V(18),
    /**
     * 交流110v
     */
    AC110V(110),
    /**
     * 交流220v
     */
    AC220V(330),
    /**
     * 交流380v
     */
    AC380V(380);

    /**
     * 电压值
     */
    private final int value;

    VoltageType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
