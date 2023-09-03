package com.github.mimiknight.designpattern.type01.pattern03.case01;

/**
 * 动物工厂类（简单工厂或静态工厂）
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-26 13:18:08
 */
public class AnimalFactory {

    private AnimalFactory() {
    }

    public static Animal getAnimal(AnimalEnum animalEnum) {
        if (null == animalEnum) {
            throw new IllegalArgumentException("argument invalid.");
        }
        if (AnimalEnum.DOG.equals(animalEnum)) {
            return new Dog();
        }
        if (AnimalEnum.CAT.equals(animalEnum)) {
            return new Cat();
        }
        return null;
    }
}
