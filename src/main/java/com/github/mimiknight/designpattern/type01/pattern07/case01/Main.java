package com.github.mimiknight.designpattern.type01.pattern07.case01;

public class Main {

    public static void main(String[] args) {

        String path = "com.github.mimiknight.designpattern.type01.pattern07";
        ContainerFactory factory = new ContainerFactory(path);

        HuaweiPhone huaweiPhone01 = factory.getBean("huawei-phone");
        huaweiPhone01.call();
        System.out.println(huaweiPhone01);

        HuaweiPhone huaweiPhone02 = factory.getBean("huawei-phone");
        huaweiPhone02.call();
        System.out.println(huaweiPhone02);

        XiaoMiPhone xiaoMiPhone01 = factory.getBean("xiaomi-phone");
        xiaoMiPhone01.call();
        System.out.println(xiaoMiPhone01);

        XiaoMiPhone xiaoMiPhone02 = factory.getBean("xiaomi-phone");
        xiaoMiPhone02.call();
        System.out.println(xiaoMiPhone02);

    }
}
