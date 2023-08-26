package com.github.mimiknight.designpattern.type01.pattern05.case03;

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
