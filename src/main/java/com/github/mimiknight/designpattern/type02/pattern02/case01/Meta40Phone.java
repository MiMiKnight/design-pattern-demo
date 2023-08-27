package com.github.mimiknight.designpattern.type02.pattern02.case01;

public class Meta40Phone extends HuaweiPhone {

    public Meta40Phone(Color color) {
        super(color);
    }

    public Meta40Phone(ColorType colorType) {
        this(ColorFactory.getColor(colorType));
    }

    @Override
    public void call() {
        System.out.println("HuaweiPhone :: Meta40Phone :: " + this.getColor().getType().getName() + " :: call()");
    }
}
