package com.github.mimiknight.designpattern.type02.pattern01.case02;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HuaweiPhone extends AbstractPhone {

    public HuaweiPhone(){
        super.setVoltage(VoltageType.DC5V);
    }

    @Override
    public void call() {
        System.out.println("HuaweiPhone :: call()");
    }
}
