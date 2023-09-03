package com.github.mimiknight.designpattern.type04.pattern05.case01;

/**
 * 创建调度器 Dispatcher
 */
public class Dispatcher {

    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }

}
