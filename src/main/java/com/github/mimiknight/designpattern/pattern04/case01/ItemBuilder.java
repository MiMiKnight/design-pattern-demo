package com.github.mimiknight.designpattern.pattern04.case01;

/**
 * Item对象建造者
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-21 07:57:11
 */
public class ItemBuilder {

    private static final Long DEFAULT_STOCK = 0L;
    private String name;

    private Long stock = DEFAULT_STOCK;

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

    public ItemBuilder setStock(Long stock) {
        if (stock > 99999L) {
            throw new IllegalArgumentException("库存异常");
        }
        this.stock = stock;
        return this;
    }

    public String getName() {
        return name;
    }

    public Long getStock() {
        return stock;
    }
}
