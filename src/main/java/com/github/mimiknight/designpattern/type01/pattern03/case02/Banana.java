package com.github.mimiknight.designpattern.type01.pattern03.case02;

public class Banana implements Fruit{
    @Override
    public void grow() {
        System.out.println("Banana :: grow()");
    }

    @Override
    public void harvest() {
        System.out.println("Banana :: harvest()");
    }

    @Override
    public void plant() {
        System.out.println("Banana :: plant()");
    }
}
