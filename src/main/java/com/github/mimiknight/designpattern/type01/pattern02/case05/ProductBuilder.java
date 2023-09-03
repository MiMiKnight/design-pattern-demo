package com.github.mimiknight.designpattern.type01.pattern02.case05;


import org.apache.commons.lang3.StringUtils;

/**
 * Product类建造类
 * <p>
 * 必填参数：PartA
 * <p>
 * 非必填参数：PartB、PartB
 * <p>
 * 限制：PartA参数不能为cat，PartB参数不能为panda
 * <p>
 * 建议在builder()方法中调用参数校验方法，将赋值和校验逻辑分离
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-26 12:09:44
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
        validPartA(this.product);
        validPartB(this.product);
        return this.product;
    }

    /**
     * 校验PartA参数
     */
    private void validPartA(Product product) {
        String partA = product.getPartA();
        // PartA参数必填
        if (StringUtils.isBlank(partA)) {
            throw new IllegalArgumentException("PartA canot be empty.");
        }
        // PartA参数不能为cat
        if ("cat".equalsIgnoreCase(partA)) {
            throw new IllegalArgumentException("PartA canot be cat.");
        }
    }

    /**
     * 校验PartB参数
     */
    private void validPartB(Product product) {
        String partB = product.getPartB();
        // PartB参数非必填
        if (null == partB) {
            return;
        }
        // PartB参数不能为空字符串
        if (StringUtils.isBlank(partB)) {
            throw new IllegalArgumentException("PartB canot be empty string.");
        }
        // PartB参数不能为cat
        if ("panda".equalsIgnoreCase(partB)) {
            throw new IllegalArgumentException("PartB canot be panda.");
        }
    }
}
