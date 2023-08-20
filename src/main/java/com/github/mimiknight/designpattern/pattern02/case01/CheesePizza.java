package com.github.mimiknight.designpattern.pattern02.case01;

/**
 * 芝士披萨
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since  2023-08-21 00:14:44
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("CheesePizza prepare cheese.");
    }
}
