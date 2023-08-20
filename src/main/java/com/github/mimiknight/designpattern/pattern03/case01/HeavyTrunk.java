package com.github.mimiknight.designpattern.pattern03.case01;

/**
 * 载重货车
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-21 00:49:51
 */
public class HeavyTrunk implements Trunk {
    @Override
    public void load() {
        System.out.println("HeavyTrunk :: load()");
    }
}
