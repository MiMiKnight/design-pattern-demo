package com.github.mimiknight.designpattern.pattern01.case02;

/**
 * 单例设计模式：静态代码块饿汉式单例设计模式
 * <p>
 * 是否线程安全：线程安全
 * <p>
 * 是否延迟加载：没有延迟加载
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-20 23:37:52
 */
public class SendEmailTask {

    private static final SendEmailTask instance;

    static {
        instance = new SendEmailTask();
    }

    private SendEmailTask() {
    }

    /**
     * 获得实例
     *
     * @return {@link SendEmailTask}
     */
    public static SendEmailTask getInstance() {
        return instance;
    }

}
