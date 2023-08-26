package com.github.mimiknight.designpattern.type01.pattern05.case01;

public class Main {
    public static void main(String[] args) {

        AbstractFactory huaweiFactory = FactoryProvider.getFactory(Brand.HUAWEI);
        Phone huweiPhone = huaweiFactory.getPhone();
        huweiPhone.call();
        Pad huaweiPad = huaweiFactory.getPad();
        huaweiPad.play();

        AbstractFactory xiaoMiFactory = FactoryProvider.getFactory(Brand.XIAO_MI);
        Phone xiaoMiPhone = xiaoMiFactory.getPhone();
        xiaoMiPhone.call();
        Pad xiaoMiPad = xiaoMiFactory.getPad();
        xiaoMiPad.play();

    }
}
