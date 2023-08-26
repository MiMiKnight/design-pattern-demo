package com.github.mimiknight.designpattern.type01.pattern03.case02;

public class Main {
    public static void main(String[] args) {

        Fruit apple = Gardener.getFruit(FruitEnum.APPLE);
        apple.plant();
        apple.grow();
        apple.harvest();

        Fruit banana = Gardener.getFruit(FruitEnum.BANANA);
        banana.plant();
        banana.grow();
        banana.harvest();

    }
}
