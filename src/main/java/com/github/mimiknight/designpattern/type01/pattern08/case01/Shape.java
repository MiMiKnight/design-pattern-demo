package com.github.mimiknight.designpattern.type01.pattern08.case01;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Shape implements Cloneable {

    private String id;
    private String type;

    public abstract void draw();

    /**
     * 浅拷贝
     *
     * @return {@link Object}
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
