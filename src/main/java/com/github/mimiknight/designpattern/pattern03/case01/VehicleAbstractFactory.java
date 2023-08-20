package com.github.mimiknight.designpattern.pattern03.case01;

/**
 * 汽车抽象工厂
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-21 00:40:24
 */
public abstract class VehicleAbstractFactory {

    /**
     * 获取货车
     *
     * @param clazz clazz
     * @return {@link Trunk}
     */
    public abstract Trunk getTrunk(Class<? extends Trunk> clazz);

    /**
     * 获取越野车
     *
     * @param clazz clazz
     * @return {@link SUV}
     */
    public abstract SUV getSUV(Class<? extends SUV> clazz);

}
