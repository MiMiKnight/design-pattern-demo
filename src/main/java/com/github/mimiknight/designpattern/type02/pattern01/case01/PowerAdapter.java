package com.github.mimiknight.designpattern.type02.pattern01.case01;

public class PowerAdapter implements Voltage {

    private Voltage voltage;

    public PowerAdapter(Voltage voltage) {
        this.voltage = voltage;
    }

    @Override
    public int output() {
        int output = this.voltage.output();
        switch (output) {
            case 5:
                output = 5;
                break;
            case 110:
                output = 110 / 22;
                break;
            case 220:
                output = 220 / 44;
                break;
            default:
                throw new IllegalArgumentException("Voltage conversion failed");
        }
        return output;
    }
}
