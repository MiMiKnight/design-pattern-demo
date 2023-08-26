package com.github.mimiknight.designpattern.type01.pattern05.case01;

public class XiaoMiFactory extends AbstractFactory {

    @Override
    Phone getPhone() {
        return new XiaoMiPhone();
    }

    @Override
    Pad getPad() {
        return new XiaoMiPad();
    }
}
