package com.github.mimiknight.designpattern.type02.pattern01.case02;

/**
 * 充电客户端
 */
public class ChargeClient {

    /**
     * 手机充电操作
     *
     * @param phone        手机
     * @param inputVoltage 给手机充电的电压
     */
    public void charge(AbstractPhone phone, IVoltage inputVoltage) {
        // 获取手机额定充电电压值
        VoltageType ratedVoltage = phone.getVoltage();
        // 实际输入电压值
        VoltageType input = inputVoltage.getVoltage();
        // 如果额定充电电压和输入的电压不一致则充电失败
        if (ratedVoltage != input) {
            System.out.println("charge failed");
            return;
        }
        System.out.println("charge success");
    }
}
