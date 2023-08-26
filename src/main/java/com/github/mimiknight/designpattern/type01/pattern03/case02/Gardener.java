package com.github.mimiknight.designpattern.type01.pattern03.case02;

public class Gardener {

    public static Fruit getFruit(FruitEnum fruitEnum) {
        if (null == fruitEnum) {
            throw new IllegalArgumentException("argument invalid.");
        }
        if (FruitEnum.APPLE.equals(fruitEnum)) {
            return new Apple();
        }
        if (FruitEnum.BANANA.equals(fruitEnum)) {
            return new Banana();
        }
        return null;
    }

}
