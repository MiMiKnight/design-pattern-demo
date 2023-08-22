package com.github.mimiknight.designpattern.pattern04.case05;


public class ProductBuilder implements ProductBuilderStandard {

    private volatile static ProductBuilder instance;
    private Product product;

    private ProductBuilder() {
    }

    public static ProductBuilder getInstance(Product product) {
        if (null == instance) {
            synchronized (ProductBuilder.class) {
                if (null == instance) {
                    instance = new ProductBuilder();
                    instance.product = product;
                }
            }
        }
        return instance;
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
