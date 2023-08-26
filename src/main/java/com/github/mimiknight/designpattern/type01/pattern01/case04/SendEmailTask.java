package com.github.mimiknight.designpattern.type01.pattern01.case04;

/**
 * 单例设计模式：懒汉式
 * <p>
 * 是否线程安全：线程安全
 * <p>
 * 是否延迟加载：延迟加载
 * <p>
 * 效率：效率不高，锁住了整个方法
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
    public static synchronized SendEmailTask getInstance() {
        if (null == instance) {
            instance = new SendEmailTask();
        }
        return instance;
    }

}
