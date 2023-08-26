package com.github.mimiknight.designpattern.type01.pattern04.case01;

public class XiaoMiPhoneFactory extends AbstractPhoneFactory {
    @Override
    Phone getPhone() {
        return new XiaoMiPhone();
    }
}
