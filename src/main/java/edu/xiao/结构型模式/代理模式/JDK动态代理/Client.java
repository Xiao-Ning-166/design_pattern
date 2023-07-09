package edu.xiao.结构型模式.代理模式.JDK动态代理;

import edu.xiao.结构型模式.代理模式.静态代理.SellTickets;

public class Client {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }

}
