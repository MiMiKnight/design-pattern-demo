package com.github.mimiknight.designpattern.type03.pattern02.case01;

public class Main {
    public static void main(String[] args) {

        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        // 命令调用者
        Broker broker = new Broker();
        // 添加待执行buyStock命令
        broker.takeOrder(buyStock);
        // 添加待执行sellStock命令
        broker.takeOrder(sellStock);

        // 执行命令
        broker.placeOrders();

    }
}
