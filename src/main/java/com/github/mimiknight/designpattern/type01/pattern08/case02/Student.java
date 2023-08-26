package com.github.mimiknight.designpattern.type01.pattern08.case02;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.util.List;

/**
 * 学生
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-26 19:22:48
 */
@ToString
@Getter
@Setter
public class Student implements Cloneable, Serializable {

    private static final long serialVersionUID = 1071560630639097582L;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 爱好
     */
    private List<String> hobby;

    /**
     * 深拷贝
     *
     * @return {@link Object}
     * @throws CloneNotSupportedException 克隆不支持例外
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return SerializationUtils.clone(this);
    }
}
