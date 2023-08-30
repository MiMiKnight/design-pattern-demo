package com.github.mimiknight.designpattern.type03.pattern02.case01;

/**
 * Order 接口的Sell实体类
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
