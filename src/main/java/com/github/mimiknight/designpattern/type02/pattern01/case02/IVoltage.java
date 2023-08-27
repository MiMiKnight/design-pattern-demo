package com.github.mimiknight.designpattern.type02.pattern01.case02;

import lombok.Getter;
import lombok.Setter;

/**
 * 电压接口
 */
@Getter
@Setter
public abstract class IVoltage {
    private VoltageType voltage;

}
