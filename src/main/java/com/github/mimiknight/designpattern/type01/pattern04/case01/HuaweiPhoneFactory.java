package com.github.mimiknight.designpattern.type01.pattern04.case01;

public class HuaweiPhoneFactory extends AbstractPhoneFactory {
    @Override
    Phone getPhone() {
        return new HuaweiPhone();
    }
}
