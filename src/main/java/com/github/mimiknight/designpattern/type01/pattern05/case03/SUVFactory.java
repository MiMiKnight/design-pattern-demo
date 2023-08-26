package com.github.mimiknight.designpattern.type01.pattern05.case03;

/**
 * 货车工厂类
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-21 00:52:13
 */
public class SUVFactory extends VehicleAbstractFactory {

    @Override
    public Trunk getTrunk(Class<? extends Trunk> clazz) {
        return null;
    }

    @Override
    public SUV getSUV(Class<? extends SUV> clazz) {
        if (null == clazz) {
            return null;
        }
        if (LargeSUV.class.equals(clazz)) {
            return new LargeSUV();
        }
        if (SmallSUV.class.equals(clazz)) {
            return new SmallSUV();
        }
        return null;
    }
}
