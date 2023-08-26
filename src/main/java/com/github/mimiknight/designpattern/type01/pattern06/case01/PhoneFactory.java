package com.github.mimiknight.designpattern.type01.pattern06.case01;

public class PhoneFactory {

    public static <T extends Phone> T getPhone(PhoneType type) {
        try {
            T phone;
            switch (type) {
                case HUAWEI:
                    phone = (T) HuaweiPhone.class.newInstance();
                    break;
                case XIAO_MI:
                    phone = (T) XiaoMiPhone.class.newInstance();
                    break;
                default:
                    throw new IllegalArgumentException("argument invalid");
            }
            return phone;
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
