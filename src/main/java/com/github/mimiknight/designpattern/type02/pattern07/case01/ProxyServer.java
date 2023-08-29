package com.github.mimiknight.designpattern.type02.pattern07.case01;

public class ProxyServer implements Network {

    private Network target;

    public ProxyServer(Network target) {
        this.target = target;
    }

    // 校验的方法
    private void check() {
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        // 先调用check方法校验
        check();
        // 真实的情况下使用work进行browse操作
        target.browse();
    }
}
