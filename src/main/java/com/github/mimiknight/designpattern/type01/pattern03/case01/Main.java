package com.github.mimiknight.designpattern.type01.pattern03.case01;

public class Main {

    public static void main(String[] args) {

        Animal dog = AnimalFactory.getAnimal(AnimalEnum.DOG);
        dog.run();

        Animal cat = AnimalFactory.getAnimal(AnimalEnum.CAT);
        cat.run();

    }

}
