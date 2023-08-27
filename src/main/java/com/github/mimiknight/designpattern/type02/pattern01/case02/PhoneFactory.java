package com.github.mimiknight.designpattern.type02.pattern01.case02;

public class PhoneFactory {

    private PhoneFactory() {
    }

    public static AbstractPhone getPhone(PhoneType type) {
        AbstractPhone phone;
        switch (type) {
            case HUAWEI:
                phone = new HuaweiPhone();
                break;
            case XIAO_MI:
                phone = new XiaoMiPhone();
                break;
            default:
                throw new IllegalArgumentException("argument invalid");
        }
        return phone;
    }
}
