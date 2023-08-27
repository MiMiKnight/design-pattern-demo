package com.github.mimiknight.designpattern.type02.pattern03.case02;

import java.util.List;

public abstract class AbstractFile {

    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract List<AbstractFile> getChildren();

    /**
     * 查杀病毒
     */
    public abstract void killVirus();
}
