package com.github.mimiknight.designpattern.type02.pattern01.case01;

/**
 * 单接口适配器模式
 */
public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone();

        Voltage5V voltage5V = new Voltage5V();
        Voltage220V voltage220V = new Voltage220V();
        Voltage110V voltage110V = new Voltage110V();
        Voltage380V voltage380V = new Voltage380V();

        // 5V电压可以正常给手机充电
        phone.charge(voltage5V);

        // 220V电压不可以正常给手机充电
        phone.charge(voltage220V);

        // 现在只有220V的电压，则需要适配器转换为合适的5V电压
        phone.charge(new PowerAdapter(voltage220V));

        // 现在只有110V的电压，则需要适配器转换为合适的5V电压
        phone.charge(new PowerAdapter(voltage110V));

        // 现在只有380V的电压，则需要适配器转换为合适的5V电压（但是电源适配器无法转换380v电压到5V）
        phone.charge(new PowerAdapter(voltage380V));

    }
}
