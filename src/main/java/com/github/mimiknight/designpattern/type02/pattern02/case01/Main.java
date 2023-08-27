package com.github.mimiknight.designpattern.type02.pattern02.case01;

/**
 * 适配器模式
 */
public class Main {

    public static void main(String[] args) {

        Color redColor = ColorFactory.getColor(ColorType.RED);
        Color blueColor = ColorFactory.getColor(ColorType.BLUE);
        Color greenColor = ColorFactory.getColor(ColorType.GREEN);

        Meta40Phone redMeta40Phone = new Meta40Phone(ColorType.RED);
        redMeta40Phone.call();
        Meta40Phone blueMeta40Phone = new Meta40Phone(ColorType.BLUE);
        blueMeta40Phone.call();

        Meta50Phone greenMeta50Phone = new Meta50Phone(greenColor);
        greenMeta50Phone.call();

        Brand vivoBrand = BrandFactory.getBrand(BrandType.VIVO);

        // 蓝色 vivo手机
        AbstractPhone blueVivoPhone = new AbstractPhone(vivoBrand, blueColor) {
            @Override
            public void call() {
                System.out.println("VivoPhone :: " + this.getColor().getType().getName() + " :: call()");
            }
        };
        blueVivoPhone.call();
    }
}
