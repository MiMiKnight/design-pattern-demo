package com.github.mimiknight.designpattern.type01.pattern02.case02;

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

    public String getName() {
        return name;
    }

    public Integer getStock() {
        return stock;
    }

    public static class ItemBuilder {
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
            if (stock > ItemBuilder.Constant.MAX_STOCK) {
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
}
