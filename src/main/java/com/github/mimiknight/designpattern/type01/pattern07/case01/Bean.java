package com.github.mimiknight.designpattern.type01.pattern07.case01;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Bean {

    /**
     * bean别名
     *
     * @return {@link String}
     */
    String value();

    /**
     * 用来标识注解容器保存对象是否是单例
     * <p>
     * true是单例容器
     * <p>
     * false则是原型容器
     *
     * @return boolean
     */
    boolean scope() default true;
}
