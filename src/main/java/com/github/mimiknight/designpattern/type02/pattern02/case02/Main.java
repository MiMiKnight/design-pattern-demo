package com.github.mimiknight.designpattern.type02.pattern02.case02;

public class Main {
    public static void main(String[] args) {

        Yellow yellow = new Yellow();
        Red red = new Red();

        HandBag redHandBag = new HandBag();
        redHandBag.setColor(red);
        System.out.println("bag description = " + redHandBag.getName());

        Wallet yellowWallet = new Wallet();
        yellowWallet.setColor(yellow);
        System.out.println("bag description = " + yellowWallet.getName());

    }
}
