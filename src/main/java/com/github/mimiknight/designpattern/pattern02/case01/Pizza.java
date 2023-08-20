package com.github.mimiknight.designpattern.pattern02.case01;

public abstract class Pizza {

    /**
     * 披萨的名字
     */
    private String name;


    /**
     * 准备披萨原材料
     * <p>
     * 不同的披萨准备的材料不一样
     */
    public abstract void prepare();

    /**
     * 烘烤披萨
     */
    public void bake() {
        System.out.println(name + "pizza is baking.");
    }

    /**
     * 切割披萨
     */
    public void cut() {
        System.out.println(name + "pizza is cutting.");
    }

    /**
     * 打包披萨
     */
    public void box() {
        System.out.println(name + "pizza is boxing.");
    }

    public void setName(String name) {
        this.name = name;
    }
}
