package com.github.mimiknight.designpattern.type02.pattern02.case01;

public abstract class HuaweiPhone extends AbstractPhone {

    protected HuaweiPhone() {
        super(BrandFactory.getBrand(BrandType.HUAWEI));
    }

    protected HuaweiPhone(Color color) {
        super(BrandFactory.getBrand(BrandType.HUAWEI), color);
    }
}
