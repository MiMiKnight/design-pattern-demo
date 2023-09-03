package com.github.mimiknight.designpattern.type04.pattern06.case01;

public class DebugFilter implements Filter {
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
