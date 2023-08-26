package com.github.mimiknight.designpattern.type01.pattern05.case02;

public class HuaweiFactory extends AbstractBrandFactory {
    @Override
    public Phone getPhone(PhoneType type) {
        Phone phone;
        switch (type) {
            case META_40:
                phone = new Meta40Phone();
                break;
            case META_50:
                phone = new Meta50Phone();
                break;
            case META_52:
                phone = new Meta52Phone();
                break;
            default:
                throw new IllegalArgumentException("argument invalid");
        }
        return phone;
    }

    @Override
    public Pad getPad(PadType type) {
        Pad pad;
        switch (type) {
            case YOUTH_M4:
                pad = new YouthM4Pad();
                break;
            case YOUTH_M5:
                pad = new YouthM5Pad();
                break;
            default:
                throw new IllegalArgumentException("argument invalid");
        }
        return pad;
    }
}
