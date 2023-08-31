package com.github.mimiknight.designpattern.type03.pattern04.case02;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 迭代器接口
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-31 20:02:48
 */
public interface Iterator<E> {

    /**
     * 是否存在下一个元素
     *
     * @return boolean
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return {@link E}
     */
    E next();

    /**
     * 移除当前元素
     */
    default void remove() {
        throw new UnsupportedOperationException("remove");
    }

    /**
     * 遍历
     *
     * @param action 行动
     */
    default void forEachRemaining(Consumer<? super E> action) {
        Objects.requireNonNull(action);
        while (hasNext())
            action.accept(next());
    }

}
