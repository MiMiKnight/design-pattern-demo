package com.github.mimiknight.designpattern.type01.pattern05.case02;

public abstract class AbstractBrandFactory {

    public abstract Phone getPhone(PhoneType type);

    public abstract Pad getPad(PadType type);
}
