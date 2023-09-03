package com.github.mimiknight.designpattern.type03.pattern08.case01;

public class StopState implements State{

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
