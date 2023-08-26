package com.github.mimiknight.designpattern.type01.pattern06.case01;

public class Main {

    public static void main(String[] args) {

        Phone huaweiPhone = PhoneFactory.getPhone(PhoneType.HUAWEI);
        huaweiPhone.call();

        Phone xiaoMiPhone = PhoneFactory.getPhone(PhoneType.XIAO_MI);
        xiaoMiPhone.call();

    }
}
