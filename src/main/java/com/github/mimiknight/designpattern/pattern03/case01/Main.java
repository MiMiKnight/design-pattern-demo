package com.github.mimiknight.designpattern.pattern03.case01;

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
