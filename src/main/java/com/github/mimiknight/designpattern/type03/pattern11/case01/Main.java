package com.github.mimiknight.designpattern.type03.pattern11.case01;

public class Main {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

    }
}
