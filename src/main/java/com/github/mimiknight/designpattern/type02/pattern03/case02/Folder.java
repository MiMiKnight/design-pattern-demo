package com.github.mimiknight.designpattern.type02.pattern03.case02;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹
 * <p>
 * 充当容器构建
 */
public class Folder extends AbstractFile {
    private final String name;

    private final List<AbstractFile> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public void add(AbstractFile file) {
        children.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        children.remove(file);
    }

    @Override
    public List<AbstractFile> getChildren() {
        return this.children;
    }

    //递归进行查杀
    @Override
    public void killVirus() {
        System.out.println("对文件夹" + name + "内进行查杀...");
        for (AbstractFile file : children) {
            file.killVirus();
        }
    }
}
