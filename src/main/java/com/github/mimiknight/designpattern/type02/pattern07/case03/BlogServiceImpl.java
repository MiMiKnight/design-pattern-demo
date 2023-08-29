package com.github.mimiknight.designpattern.type02.pattern07.case03;

public class BlogServiceImpl implements BlogService {
    @Override
    public void add() {
        System.out.println("用户新发表博客");
    }

    @Override
    public void edit() {
        System.out.println("用户重新编辑博客");
    }
}
