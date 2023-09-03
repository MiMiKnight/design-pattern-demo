package com.github.mimiknight.designpattern.type01.pattern02.case04;


/**
 * 产品建造者
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-21 23:13:04
 */
public class ProductBuilder implements ProductBuilderStandard {

    private final Product product;

    public ProductBuilder() {
        this.product = new Product();
    }

    @Override
    public ProductBuilder setPartA(String part) {
        this.product.setPartA(part);
        return this;
    }

    @Override
    public ProductBuilder setPartB(String part) {
        this.product.setPartB(part);
        return this;
    }

    @Override
    public ProductBuilder setPartC(String part) {
        this.product.setPartC(part);
        return this;
    }

    @Override
    public Product build() {
        return this.product;
    }
}
