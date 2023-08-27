package com.github.mimiknight.designpattern.type02.pattern03.case02;

import java.util.List;

/**
 * 图片文件
 * <p>
 * 充当叶子构建
 */
public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("不支持此方法...");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("不支持此方法...");
    }

    @Override
    public List<AbstractFile> getChildren() {
        System.out.println("不支持此方法...");
        return null;
    }


    @Override
    public void killVirus() {
        System.out.println("对图片文件" + name + "进行查杀中...");
    }
}
