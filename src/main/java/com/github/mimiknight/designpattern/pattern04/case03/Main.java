package com.github.mimiknight.designpattern.pattern04.case03;

public class Main {

    public static void main(String[] args) {

        ProductBuilder builder = new ProductBuilder();
        Product product = builder.setPartA("partA01").setPartB("partB01").setPartC("partC01").build();
        System.out.println("product01 :: " + product.toString());

    }
}
