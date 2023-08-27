package com.github.mimiknight.designpattern.type02.pattern02.case01;

public abstract class XiaoMiPhone extends AbstractPhone {

    protected XiaoMiPhone() {
        super(BrandFactory.getBrand(BrandType.XIAO_MI));
    }

    protected XiaoMiPhone(Color color) {
        super(BrandFactory.getBrand(BrandType.XIAO_MI), color);
    }
}
