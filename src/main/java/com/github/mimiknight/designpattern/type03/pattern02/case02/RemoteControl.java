package com.github.mimiknight.designpattern.type03.pattern02.case02;

/**
 * 电视遥控器 命令调用者
 */
public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }

}
