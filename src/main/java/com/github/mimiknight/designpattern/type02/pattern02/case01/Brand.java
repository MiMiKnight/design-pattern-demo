package com.github.mimiknight.designpattern.type02.pattern02.case01;

public abstract class Brand {

    private final BrandType type;
    protected Brand(BrandType type) {
        this.type = type;
    }

    public BrandType getType() {
        return type;
    }
}
