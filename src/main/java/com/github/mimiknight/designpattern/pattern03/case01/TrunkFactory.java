package com.github.mimiknight.designpattern.pattern03.case01;

/**
 * 货车工厂类
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-21 00:52:13
 */
public class TrunkFactory extends VehicleAbstractFactory {

    @Override
    public Trunk getTrunk(Class<? extends Trunk> clazz) {
        if (null == clazz) {
            return null;
        }
        if (HeavyTrunk.class.equals(clazz)) {
            return new HeavyTrunk();
        }
        if (VanTrunk.class.equals(clazz)) {
            return new VanTrunk();
        }
        return null;
    }

    @Override
    public SUV getSUV(Class<? extends SUV> clazz) {
        return null;
    }
}
