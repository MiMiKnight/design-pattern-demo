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

        DCVoltage dc5V = dcVoltageFactory.getDCVoltage(VoltageType.DC5V);
        DCVoltage dc12V = dcVoltageFactory.getDCVoltage(VoltageType.DC12V);
        DCVoltage dc18V = dcVoltageFactory.getDCVoltage(VoltageType.DC18V);
        ACVoltage ac110V = acVoltageFactory.getACVoltage(VoltageType.AC110V);
        ACVoltage ac220V = acVoltageFactory.getACVoltage(VoltageType.AC220V);
        ACVoltage ac380V = acVoltageFactory.getACVoltage(VoltageType.AC380V);

        AbstractPhone huaweiPhone = PhoneFactory.getPhone(PhoneType.HUAWEI);
        AbstractPhone xiaoMiPhone = PhoneFactory.getPhone(PhoneType.XIAO_MI);

        // 充电客户端
        ChargeClient client = new ChargeClient();

        // 5V直流电压可以直接给华为手机充电
        client.charge(huaweiPhone, dc5V);
        // 220V交流电压不可以直接给华为手机充电
        client.charge(huaweiPhone, ac220V);

        // 12V直流电压可以直接给小米手机充电
        client.charge(xiaoMiPhone, dc12V);
        // 220V交流电压不可以直接给小米手机充电
        client.charge(xiaoMiPhone, ac220V);

        // charge success
        client.charge(huaweiPhone, new PowerAdapter(ac110V, dc5V));
        // charge failed
        client.charge(huaweiPhone, new PowerAdapter(ac110V, dc12V));
        // charge success
        client.charge(huaweiPhone, new PowerAdapter(ac220V, dc5V));
        // charge failed
        client.charge(huaweiPhone, new PowerAdapter(ac220V, dc12V));

        // charge success
        client.charge(xiaoMiPhone, new PowerAdapter(ac110V, dc12V));
        // charge failed
        client.charge(xiaoMiPhone, new PowerAdapter(ac110V, dc5V));
        // charge success
        client.charge(xiaoMiPhone, new PowerAdapter(ac220V, dc12V));
        // charge failed
        client.charge(xiaoMiPhone, new PowerAdapter(ac220V, dc5V));

        // 充电适配器不支持380V的输入电压
        client.charge(huaweiPhone, new PowerAdapter(ac380V, dc5V));

        // 充电适配器不支持18V的输出电压
        client.charge(huaweiPhone, new PowerAdapter(ac220V, dc18V));

    }
}
