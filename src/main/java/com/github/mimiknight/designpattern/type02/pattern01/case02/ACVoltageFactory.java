package com.github.mimiknight.designpattern.type02.pattern01.case02;

public class ACVoltageFactory extends AbstractVoltageFactory {
    @Override
    public DCVoltage getDCVoltage(VoltageType type) {
        return null;
    }

    @Override
    public ACVoltage getACVoltage(VoltageType type) {
        ACVoltage voltage;
        switch (type) {
            case AC110V:
                voltage = new ACVoltage110V();
                break;
            case AC220V:
                voltage = new ACVoltage220V();
                break;
            case AC380V:
                voltage = new ACVoltage380V();
                break;
            default:
                throw new IllegalArgumentException("argument invalid");
        }
        return voltage;
    }
}
