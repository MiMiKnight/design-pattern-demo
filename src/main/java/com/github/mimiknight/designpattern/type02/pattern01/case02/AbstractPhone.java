package com.github.mimiknight.designpattern.type02.pattern01.case02;


import lombok.Getter;
import lombok.Setter;

/**
 * 手机抽象类
 */
@Getter
@Setter
public abstract class AbstractPhone {

    private VoltageType voltage;

    public abstract void call();

}
