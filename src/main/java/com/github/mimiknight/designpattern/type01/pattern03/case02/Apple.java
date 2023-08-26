package com.github.mimiknight.designpattern.type01.pattern03.case02;

public class Apple implements Fruit{
    @Override
    public void grow() {
        System.out.println("Apple :: grow()");
    }

    @Override
    public void harvest() {
        System.out.println("Apple :: harvest()");
    }

    @Override
    public void plant() {
        System.out.println("Apple :: plant()");
    }
}
