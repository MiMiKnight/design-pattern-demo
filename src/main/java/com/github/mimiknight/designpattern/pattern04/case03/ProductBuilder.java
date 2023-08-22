package com.github.mimiknight.designpattern.pattern04.case03;

public class ProductBuilder implements ProductBuilderStandard {

    private final Product product;

    public ProductBuilder() {
        this.product = new Product();
    }

    @Override
    public ProductBuilderStandard setPartA(String part) {
        this.product.setPartA(part);
        return this;
    }

    @Override
    public ProductBuilderStandard setPartB(String part) {
        this.product.setPartB(part);
        return this;
    }

    @Override
    public ProductBuilderStandard setPartC(String part) {
        this.product.setPartC(part);
        return this;
    }

    @Override
    public Product build() {
        return this.product;
    }
}
