package com.github.mimiknight.designpattern.type02.pattern02.case01;

public class RedMiPro10Phone extends XiaoMiPhone {

    public RedMiPro10Phone(Color color) {
        super(color);
    }

    public RedMiPro10Phone(ColorType colorType) {
        this(ColorFactory.getColor(colorType));
    }

    @Override
    public void call() {
        System.out.println("XiaoMiPhone :: RedMiPro10Phone :: " + this.getColor().getType().getName() + " :: call()");
    }
}
