package com.github.mimiknight.designpattern.pattern02.case02;

/**
 * 形状工厂
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-21 00:33:31
 */
public class ShapeFactory {

    /**
     * 获取Shape
     *
     * @param clazz clazz
     * @return {@link Shape}
     */
    public static Shape getShape(Class<? extends Shape> clazz) {
        if (null == clazz) {
            return null;
        }
        if (Circle.class.equals(clazz)) {
            return new Circle();
        }
        if (Rectangle.class.equals(clazz)) {
            return new Rectangle();
        }
        return null;
    }
}
