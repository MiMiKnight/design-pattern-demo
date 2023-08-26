package com.github.mimiknight.designpattern.type01.pattern05.case03;

public class Main {
    public static void main(String[] args) {

        VehicleAbstractFactory trunkFactory = VehicleFactoryProvider.getFactory("trunk");
        VehicleAbstractFactory suvFactory = VehicleFactoryProvider.getFactory("suv");

        Trunk heavyTrunk = trunkFactory.getTrunk(HeavyTrunk.class);
        heavyTrunk.load();

        Trunk vanTrunk = trunkFactory.getTrunk(VanTrunk.class);
        vanTrunk.load();

        SUV largeSUV = suvFactory.getSUV(LargeSUV.class);
        largeSUV.carry();

        SUV smallSUV = suvFactory.getSUV(SmallSUV.class);
        smallSUV.carry();

    }
}
