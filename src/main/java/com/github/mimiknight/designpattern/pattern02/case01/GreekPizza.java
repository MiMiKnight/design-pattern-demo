package com.github.mimiknight.designpattern.pattern02.case01;

/**
 * 希腊披萨
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-21 00:14:51
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("GreekPizza prepare yogurt.");
    }
}
