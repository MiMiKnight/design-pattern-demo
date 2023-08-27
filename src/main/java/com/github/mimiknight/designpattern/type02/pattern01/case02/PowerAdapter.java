package com.github.mimiknight.designpattern.type02.pattern01.case02;


/**
 * 华为电源适配器
 * <p>
 * 适配器只支持 AC110和AC220电源输出
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-27 10:05:48
 */
public class PowerAdapter extends IVoltage {

    /**
     * 输入交流电压
     */
    private final ACVoltage inputVoltage;

    /**
     * 期待的输出直流电压
     */
    private final DCVoltage outputVoltage;

    /**
     * 电源适配器
     *
     * @param input  输入电压
     * @param output 期待输出电压
     */
    public PowerAdapter(ACVoltage input, DCVoltage output) {
        this.inputVoltage = input;
        this.outputVoltage = output;
    }

    @Override
    public VoltageType getVoltage() {
        return convert(this.inputVoltage, this.outputVoltage);
    }

    /**
     * 电压转换
     * <p>
     * 只支持输入110和220的电压
     *
     * @param outputVoltage 输出电压
     * @return {@link Integer}
     */
    private VoltageType convert(IVoltage inputVoltage, IVoltage outputVoltage) {
        VoltageType voltage = inputVoltage.getVoltage();
        switch (voltage) {
            case AC110V:
            case AC220V:
                voltage = getOutput(outputVoltage);
                break;
            default:
                throw new IllegalArgumentException("The input voltage does not support");
        }
        return voltage;
    }

    /**
     * 得到输出
     * <p>
     * 只支持输出5V和12V的电压
     *
     * @param outputVoltage 输出电压
     * @return {@link Integer}
     */
    private VoltageType getOutput(IVoltage outputVoltage) {
        VoltageType voltage = outputVoltage.getVoltage();
        switch (voltage) {
            case DC5V:
            case DC12V:
                break;
            default:
                throw new IllegalArgumentException("The output voltage does not support");
        }
        return voltage;
    }

}
