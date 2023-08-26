package com.github.mimiknight.designpattern.type01.pattern02.case04;

public class Main {

    public static void main(String[] args) {

        Product product01 = Product.builder().setPartA("partA01").setPartB("partB01").setPartC("partC01").build();
        System.out.println("product01 :: " + product01.toString());

        Product product02 = Product.builder().setPartA("partA02").setPartB("partB02").setPartC("partC02").build();
        System.out.println("product02 :: " + product02.toString());

    }
}
