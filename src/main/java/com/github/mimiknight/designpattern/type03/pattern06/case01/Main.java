package com.github.mimiknight.designpattern.type03.pattern06.case01;

public class Main {
    public static void main(String[] args) {

        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");

    }
}
