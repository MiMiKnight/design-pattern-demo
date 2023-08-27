package com.github.mimiknight.designpattern.type02.pattern02.case01;

public class Meta50Phone extends HuaweiPhone {

    public Meta50Phone(Color color) {
        super(color);
    }

    public Meta50Phone(ColorType colorType) {
        this(ColorFactory.getColor(colorType));
    }

    @Override
    public void call() {
        System.out.println("HuaweiPhone :: Meta50Phone :: " + this.getColor().getType().getName() + " :: call()");
    }
}
