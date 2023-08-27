package com.github.mimiknight.designpattern.type02.pattern01.case02;

public class VoltageFactoryProvider {

    private VoltageFactoryProvider() {
    }

    public static AbstractVoltageFactory getVoltageFactory(ElectricCurrentType type) {
        AbstractVoltageFactory factory;
        switch (type) {
            case AC:
                factory = new ACVoltageFactory();
                break;
            case DC:
                factory = new DCVoltageFactory();
                break;
            default:
                throw new IllegalArgumentException("argument invalid");
        }
        return factory;
    }
}
