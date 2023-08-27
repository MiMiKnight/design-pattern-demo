package com.github.mimiknight.designpattern.type02.pattern01.case02;

/**
 * 单接口适配器模式案例
 */
public class Main {

    public static void main(String[] args) {

        // 交流电压工厂
        AbstractVoltageFactory acVoltageFactory = VoltageFactoryProvider.getVoltageFactory(ElectricCurrentType.AC);
        // 直流电压工厂
        AbstractVoltageFactory dcVoltageFactory = VoltageFactoryProvider.getVoltageFactory(ElectricCurrentType.DC);

        DCVoltage voltage5V = dcVoltageFactory.getDCVoltage(VoltageType.DC5V);
        DCVoltage voltage12V = dcVoltageFactory.getDCVoltage(VoltageType.DC12V);
        DCVoltage voltage18V = dcVoltageFactory.getDCVoltage(VoltageType.DC18V);
        ACVoltage voltage110V = acVoltageFactory.getACVoltage(VoltageType.AC110V);
        ACVoltage voltage220V = acVoltageFactory.getACVoltage(VoltageType.AC220V);
        ACVoltage voltage380V = acVoltageFactory.getACVoltage(VoltageType.AC380V);

        AbstractPhone huaweiPhone = PhoneFactory.getPhone(PhoneType.HUAWEI);
        AbstractPhone xiaoMiPhone = PhoneFactory.getPhone(PhoneType.XIAO_MI);

        // 充电客户端
        ChargeClient client = new ChargeClient();

        // 5V电压可以直接给华为手机充电
        client.charge(huaweiPhone, voltage5V);
        // 220V电压不可以直接给华为手机充电
        client.charge(huaweiPhone, voltage220V);

        // 12V电压可以直接给小米手机充电
        client.charge(xiaoMiPhone, voltage12V);
        // 220V电压不可以直接给小米手机充电
        client.charge(xiaoMiPhone, voltage220V);

        // charge success
        client.charge(huaweiPhone, new PowerAdapter(voltage110V, voltage5V));
        // charge failed
        client.charge(huaweiPhone, new PowerAdapter(voltage110V, voltage12V));
        // charge success
        client.charge(huaweiPhone, new PowerAdapter(voltage220V, voltage5V));
        // charge failed
        client.charge(huaweiPhone, new PowerAdapter(voltage220V, voltage12V));

        // charge success
        client.charge(xiaoMiPhone, new PowerAdapter(voltage110V, voltage12V));
        // charge failed
        client.charge(xiaoMiPhone, new PowerAdapter(voltage110V, voltage5V));
        // charge success
        client.charge(xiaoMiPhone, new PowerAdapter(voltage220V, voltage12V));
        // charge failed
        client.charge(xiaoMiPhone, new PowerAdapter(voltage220V, voltage5V));

        // 充电适配器不支持380V的输入电压
        client.charge(huaweiPhone, new PowerAdapter(voltage380V, voltage5V));

        // 充电适配器不支持18V的输出电压
        client.charge(huaweiPhone, new PowerAdapter(voltage220V, voltage18V));

    }
}
