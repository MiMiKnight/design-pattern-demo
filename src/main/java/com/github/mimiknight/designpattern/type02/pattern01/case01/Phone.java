package com.github.mimiknight.designpattern.type02.pattern01.case01;

/**
 * 手机只支持5V的电压充电
 */
public class Phone {

    public void charge(Voltage voltage) {
        int output = voltage.output();
        if (5 == output) {
            System.out.println("phone charging");
            return;
        }
        System.out.println("phone charge failed");
    }

}
