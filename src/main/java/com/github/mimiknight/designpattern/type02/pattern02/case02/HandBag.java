package com.github.mimiknight.designpattern.type02.pattern02.case02;

/**
 * 手提包
 */
public class HandBag extends Bag {

    @Override
    public String getName() {
        return color.getColor() + " HandBag";
    }
}
