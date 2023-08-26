package com.github.mimiknight.designpattern.type01.pattern05.case03;

/**
 * 汽车工厂提供
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-21 00:59:55
 */
public class VehicleFactoryProvider {

    public static VehicleAbstractFactory getFactory(String name) {
        if ("trunk".equals(name)) {
            return new TrunkFactory();
        }
        if ("suv".equals(name)) {
            return new SUVFactory();
        }
        return null;
    }
}
