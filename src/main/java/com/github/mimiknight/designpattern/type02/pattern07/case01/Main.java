package com.github.mimiknight.designpattern.type02.pattern07.case01;

/**
 * 静态代理
 */
public class Main {
    public static void main(String[] args) {

        Server server = new Server();
        server.browse();

        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();

    }
}
