package com.github.mimiknight.designpattern.type02.pattern02.case01;

import lombok.Getter;

@Getter
public abstract class AbstractPhone {

    /**
     * 品牌
     */
    private final Brand brand;

    /**
     * 颜色
     */
    private Color color;

    protected AbstractPhone(Brand brand) {
        this.brand = brand;
    }

    protected AbstractPhone(Brand brand, Color color) {
        this(brand);
        this.color = color;
    }

    public abstract void call();


}
