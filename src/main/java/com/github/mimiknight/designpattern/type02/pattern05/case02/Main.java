package com.github.mimiknight.designpattern.type02.pattern05.case02;

public class Main {
    public static void main(String[] args) {

        OperatingSystem operatingSystem = new OperatingSystem();

        // 操作系统调用磁盘进行读取
        operatingSystem.read();
        // 操作系统调用显示器进行图形绘制
        operatingSystem.draw();
        // 操作系统调用键盘进行内容输入
        operatingSystem.input();


    }
}
