package com.github.mimiknight.designpattern.type02.pattern02.case01;

public class BrandFactory {

    private BrandFactory() {
    }

    public static Brand getBrand(BrandType type) {
        Brand brand;
        switch (type) {
            case HUAWEI:
                brand = new HuaweiBrand();
                break;
            case XIAO_MI:
                brand = new XiaoMiBrand();
                break;
            case VIVO:
                brand = new VivoBrand();
                break;
            default:
                throw new IllegalArgumentException("argument invalid");
        }
        return brand;
    }
}
