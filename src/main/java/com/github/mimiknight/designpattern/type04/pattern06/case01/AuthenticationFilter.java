package com.github.mimiknight.designpattern.type04.pattern06.case01;

public class AuthenticationFilter implements Filter{

    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
