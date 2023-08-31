package com.github.mimiknight.designpattern.type03.pattern06.case01;

import java.util.Date;

public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }

}
