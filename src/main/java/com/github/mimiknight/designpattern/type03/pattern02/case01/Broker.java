package com.github.mimiknight.designpattern.type03.pattern02.case01;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类
 */
public class Broker {

    private final List<Order> orders = new ArrayList<>();

    /**
     * 添加待执行的命令
     *
     * @param order 订单
     */
    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        // 循环执行命令
        for (Order order : orders) {
            order.execute();
        }
        // 清理命令
        orders.clear();
    }
}
