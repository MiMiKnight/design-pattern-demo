package com.github.mimiknight.designpattern.type02.pattern01.case02;

public class DCVoltageFactory extends AbstractVoltageFactory {

    @Override
    public DCVoltage getDCVoltage(VoltageType type) {
        DCVoltage voltage;
        switch (type) {
            case DC5V:
                voltage = new DCVoltage5V();
                break;
            case DC12V:
                voltage = new DCVoltage12V();
                break;
            case DC18V:
                voltage = new DCVoltage18V();
                break;
            default:
                throw new IllegalArgumentException("arugment invalid");
        }
        return voltage;
    }

    @Override
    public ACVoltage getACVoltage(VoltageType type) {
        return null;
    }
}
