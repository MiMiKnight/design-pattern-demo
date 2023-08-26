package com.github.mimiknight.designpattern.type01.pattern05.case02;

public class XiaoMiFactory extends AbstractBrandFactory {
    @Override
    public Phone getPhone(PhoneType type) {
        Phone phone;
        switch (type) {
            case RED_MI_PRO_10:
                phone = new RedMiPro10Phone();
                break;
            case RED_MI_PRO_12:
                phone = new RedMiPro12Phone();
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
            case KK_01:
                pad = new KK01Pad();
                break;
            case KK_02:
                pad = new KK02Pad();
                break;
            default:
                throw new IllegalArgumentException("argument invalid");
        }
        return pad;
    }
}
