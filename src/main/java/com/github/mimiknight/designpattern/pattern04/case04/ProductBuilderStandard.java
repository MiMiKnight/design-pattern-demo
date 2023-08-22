package com.github.mimiknight.designpattern.pattern04.case04;

/**
 * 产品建造者接口
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-21 23:13:21
 */
public interface ProductBuilderStandard {

    ProductBuilder setPartA(String part);

    ProductBuilder setPartB(String part);

    ProductBuilder setPartC(String part);

    Product build();
}
