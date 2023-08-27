package com.github.mimiknight.designpattern.type02.pattern02.case01;

public class RedMiPro11Phone extends XiaoMiPhone {

    public RedMiPro11Phone(Color color) {
        super(color);
    }

    public RedMiPro11Phone(ColorType colorType) {
        this(ColorFactory.getColor(colorType));
    }

    @Override
    public void call() {
        System.out.println("XiaoMiPhone :: RedMiPro11Phone :: " + this.getColor().getType().getName() + " :: call()");
    }
}
