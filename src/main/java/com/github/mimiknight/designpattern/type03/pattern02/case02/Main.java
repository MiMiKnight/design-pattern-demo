package com.github.mimiknight.designpattern.type03.pattern02.case02;

public class Main {
    public static void main(String[] args) {

        //声明一个遥控器对象
        RemoteControl control = new RemoteControl();
        //声明接收者
        TV tv = new TV();
        //给遥控器指定一个打开电视机的命令
        control.setCommand(new TurnOnTVCommand(tv));
        //执行命令
        control.pressButton();

        //给遥控器指定一个关闭电视机的命令
        control.setCommand(new TurnOffTVCommand(tv));
        //执行命令
        control.pressButton();

    }
}
