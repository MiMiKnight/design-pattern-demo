package com.github.mimiknight.designpattern.type01.pattern04.case01;

public class Main {

    public static void main(String[] args) {
        HuaweiPhoneFactory huaweiPhoneFactory = new HuaweiPhoneFactory();
        Phone huaweiPhone = huaweiPhoneFactory.getPhone();
        huaweiPhone.call();

        XiaoMiPhoneFactory xiaoMiPhoneFactory = new XiaoMiPhoneFactory();
        Phone xiaoMiPhone = xiaoMiPhoneFactory.getPhone();
        xiaoMiPhone.call();
    }
}
