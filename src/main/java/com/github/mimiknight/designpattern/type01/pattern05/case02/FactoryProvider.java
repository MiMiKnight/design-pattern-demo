package com.github.mimiknight.designpattern.type01.pattern05.case02;


public class FactoryProvider {

    public static AbstractBrandFactory getFactory(BrandType type) {
        AbstractBrandFactory factory;
        switch (type) {
            case HUAWEI:
                factory = new HuaweiFactory();
                break;
            case XIAO_MI:
                factory = new XiaoMiFactory();
                break;
            default:
                throw new IllegalArgumentException("argument invalid");
        }
        return factory;
    }
}
