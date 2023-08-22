package com.github.mimiknight.designpattern.pattern04.case05;

public class Main {

    public static void main(String[] args) {

        Product product01 = Product.builder().setPartA("partA01").setPartB("partB01").setPartC("partC01").build();
        System.out.println("product01 ::" + product01.toString());

    }
}
