package com.github.mimiknight.designpattern.type02.pattern04.case01;

/**
 * 被装饰对象 具体实现类
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
