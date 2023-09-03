package com.github.mimiknight.designpattern.type04.pattern05.case01;

public class Main {
    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");

    }
}
