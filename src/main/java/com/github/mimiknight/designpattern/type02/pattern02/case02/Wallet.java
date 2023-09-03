package com.github.mimiknight.designpattern.type02.pattern02.case02;

/**
 * 钱包
 */
public class Wallet extends Bag {

    @Override
    public String getName() {
        return color.getColor() + " Wallet";
    }
}
