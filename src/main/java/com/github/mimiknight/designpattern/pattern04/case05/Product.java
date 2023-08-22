package com.github.mimiknight.designpattern.pattern04.case05;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Product {

    private String partA;
    private String partB;
    private String partC;

    public Product() {
    }

    public static ProductBuilder builder() {
        return ProductBuilder.getInstance(new Product());
    }

}
