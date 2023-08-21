package com.github.mimiknight.designpattern.pattern04.case01;

/**
 * 建造者模式Demo
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-21 07:59:39
 */
public class Main {
    public static void main(String[] args) {
        ItemBuilder itemBuilder = new ItemBuilder();
        Item item = itemBuilder.setName("苹果").setStock(58L).build();

        String name = item.getName();
        System.out.println("Item name ::" + name);

        Long stock = item.getStock();
        System.out.println("Item stock ::" + stock);
    }
}
