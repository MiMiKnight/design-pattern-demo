package com.github.mimiknight.designpattern.type02.pattern05.case02;

/**
 * 操作系统 充当门面（Facade）
 */
public class OperatingSystem {

    private Monitor monitor;
    private Keyboard keyboard;
    private DiskDrive diskDrive;

    public OperatingSystem() {
        this.diskDrive = new DiskDrive();
        this.keyboard = new Keyboard();
        this.monitor = new Monitor();
    }

    public void draw() {
        this.monitor.draw();
    }

    public void read() {
        this.diskDrive.read();
    }

    public void input() {
        this.keyboard.input();
    }
}
