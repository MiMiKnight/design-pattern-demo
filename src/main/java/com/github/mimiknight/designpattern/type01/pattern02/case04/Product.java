package com.github.mimiknight.designpattern.type01.pattern02.case04;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 产品（被建造的对象）
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-21 23:14:19
 */
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
