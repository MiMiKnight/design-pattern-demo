package com.github.mimiknight.designpattern.pattern03.case01;

/**
 * 小型货车
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-21 00:50:03
 */
public class VanTrunk implements Trunk {
    @Override
    public void load() {
        System.out.println("VanTrunk :: load()");
    }
}
