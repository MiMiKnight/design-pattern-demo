package com.github.mimiknight.designpattern.pattern04.case01;

public class Item {

    /**
     * 条码名称
     */
    private String name;

    /**
     * 库存
     */
    private Long stock;

    public Item(ItemBuilder builder) {
        this.name = builder.getName();
        this.stock = builder.getStock();
    }

    public String getName() {
        return name;
    }

    public Long getStock() {
        return stock;
    }
}
