package com.github.mimiknight.designpattern.type01.pattern02.case03;

public interface ProductBuilderStandard {

    ProductBuilder setPartA(String part);

    ProductBuilder setPartB(String part);

    ProductBuilder setPartC(String part);

    Product build();
}
