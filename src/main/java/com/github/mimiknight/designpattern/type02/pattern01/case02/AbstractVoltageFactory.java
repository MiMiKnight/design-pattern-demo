package com.github.mimiknight.designpattern.type02.pattern01.case02;

/**
 * 电压抽象工厂类
 */
public abstract class AbstractVoltageFactory {

    public abstract DCVoltage getDCVoltage(VoltageType type);
    public abstract ACVoltage getACVoltage(VoltageType type);

}
