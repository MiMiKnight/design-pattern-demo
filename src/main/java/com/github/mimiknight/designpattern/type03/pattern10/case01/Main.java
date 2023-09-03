package com.github.mimiknight.designpattern.type03.pattern10.case01;

public class Main {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();

    }
}
