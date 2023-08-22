package com.github.mimiknight.designpattern.pattern04.case05;

public interface ProductBuilderStandard {

    ProductBuilder setPartA(String part);

    ProductBuilder setPartB(String part);

    ProductBuilder setPartC(String part);

    Product build();

}
