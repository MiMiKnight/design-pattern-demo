package com.github.mimiknight.designpattern.type01.pattern05.case02;

public class Main {

    public static void main(String[] args) {

        AbstractBrandFactory huaweiFactory = FactoryProvider.getFactory(BrandType.HUAWEI);
        Phone mete40Phone = huaweiFactory.getPhone(PhoneType.META_40);
        mete40Phone.call();
        Pad youthM4Pad = huaweiFactory.getPad(PadType.YOUTH_M4);
        youthM4Pad.play();

        AbstractBrandFactory xiaoMiFactory = FactoryProvider.getFactory(BrandType.XIAO_MI);
        Phone redMiPro10Phone = xiaoMiFactory.getPhone(PhoneType.RED_MI_PRO_10);
        redMiPro10Phone.call();
        Pad kk01Pad = xiaoMiFactory.getPad(PadType.KK_01);
        kk01Pad.play();
    }
}
