package com.github.mimiknight.designpattern.type01.pattern05.case01;

public class HuaweiFactory extends AbstractFactory {

    @Override
    Phone getPhone() {
        return new HuaweiPhone();
    }

    @Override
    Pad getPad() {
        return new HuaweiPad();
    }
}
