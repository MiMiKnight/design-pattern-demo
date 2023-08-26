package com.github.mimiknight.designpattern.type01.pattern02.case05;

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

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

}
