package com.github.mimiknight.designpattern.type02.pattern01.case02;

public class XiaoMiPhone extends AbstractPhone {

    public XiaoMiPhone() {
        super.setVoltage(VoltageType.DC12V);
    }

    @Override
    public void call() {
        System.out.println("XiaoMiPhone :: call()");
    }
}
