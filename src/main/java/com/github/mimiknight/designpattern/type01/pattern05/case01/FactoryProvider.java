package com.github.mimiknight.designpattern.type01.pattern05.case01;

/**
 * 工厂提供者
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-26 14:57:19
 */
public class FactoryProvider {

    private FactoryProvider() {
    }

    public static AbstractFactory getFactory(Brand brand) {
        AbstractFactory factory;
        switch (brand) {
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
