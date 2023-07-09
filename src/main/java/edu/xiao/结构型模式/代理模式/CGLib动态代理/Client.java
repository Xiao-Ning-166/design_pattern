package edu.xiao.结构型模式.代理模式.CGLib动态代理;


public class Client {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }

}
