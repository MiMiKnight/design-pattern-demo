package com.github.mimiknight.designpattern.pattern01.case06;

/**
 * 单例设计模式：登记式/静态内部类  饿汉式
 * <p>
 * 是否线程安全：线程安全
 * <p>
 * 是否延迟加载：延迟加载
 * <p>
 * 效率：效率提高
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-20 23:37:52
 */
public class SendEmailTask {

    private SendEmailTask() {
    }

    private static final class InstanceHolder {
        static final SendEmailTask instance = new SendEmailTask();
    }

    /**
     * 获得实例
     *
     * @return {@link SendEmailTask}
     */
    public static SendEmailTask getInstance() {
        return InstanceHolder.instance;
    }

}
