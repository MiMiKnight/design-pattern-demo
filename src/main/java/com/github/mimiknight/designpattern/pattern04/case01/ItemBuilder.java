package com.github.mimiknight.designpattern.pattern04.case01;

/**
 * Item对象建造者
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-21 07:57:11
 */
public class ItemBuilder {

    private static final Integer DEFAULT_STOCK = 0;
    private String name;

    private Integer stock = DEFAULT_STOCK;

    interface Constant {
        Integer MIN_STOCK = 0;
        Integer MAX_STOCK = 99999;
        Integer DEFAULT_STOCK = MIN_STOCK;
    }

    public Item build() {
        return new Item(this);
    }

    public ItemBuilder setName(String name) {
        if (null == name) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        return this;
    }

    public ItemBuilder setStock(Integer stock) {
        if (stock > Constant.MAX_STOCK) {
            throw new IllegalArgumentException("库存异常");
        }
        this.stock = stock;
        return this;
    }

    public String getName() {
        return name;
    }

    public Integer getStock() {
        return stock;
    }
}
