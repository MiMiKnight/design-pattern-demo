package com.github.mimiknight.designpattern.type01.pattern01.case03;

/**
 * 单例设计模式：懒汉式
 * <p>
 * 是否线程安全：线程不安全
 * <p>
 * 是否延迟加载：延迟加载
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-20 23:37:52
 */
public class SendEmailTask {

    private static SendEmailTask instance;

    private SendEmailTask() {
    }

    /**
     * 获得实例
     *
     * @return {@link SendEmailTask}
     */
    public static SendEmailTask getInstance() {
        if (null == instance) {
            instance = new SendEmailTask();
        }
        return instance;
    }

}
