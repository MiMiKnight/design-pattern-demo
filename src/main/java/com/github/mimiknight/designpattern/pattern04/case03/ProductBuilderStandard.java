package com.github.mimiknight.designpattern.pattern04.case03;

public interface ProductBuilderStandard {

    ProductBuilderStandard setPartA(String part);

    ProductBuilderStandard setPartB(String part);

    ProductBuilderStandard setPartC(String part);

    Product build();
}
