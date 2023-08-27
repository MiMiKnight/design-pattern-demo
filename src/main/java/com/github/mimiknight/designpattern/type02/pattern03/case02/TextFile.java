package com.github.mimiknight.designpattern.type02.pattern03.case02;

import java.util.List;

/**
 * 文本文件
 * <p>
 * 充当叶子构建
 */
public class TextFile extends AbstractFile{
    private String name;

    public TextFile(String name) {
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
        System.out.println("对文本文件" + name + "进行查杀中...");
    }
}
