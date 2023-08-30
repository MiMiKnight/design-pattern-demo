package com.github.mimiknight.designpattern.type03.pattern02.case01;

/**
 * Order 接口的Buy实体类
 */
public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
