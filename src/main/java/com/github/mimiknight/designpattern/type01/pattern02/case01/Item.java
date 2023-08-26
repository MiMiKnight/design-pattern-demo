package com.github.mimiknight.designpattern.type01.pattern02.case01;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    /**
     * 条码名称
     */
    private String name;

    /**
     * 库存
     */
    private Integer stock;

    public Item(ItemBuilder builder) {
        this.name = builder.getName();
        this.stock = builder.getStock();
    }

}
