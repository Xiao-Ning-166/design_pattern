package edu.xiao.结构型模式.代理模式.静态代理;

/**
 * 服务 —— 被代理类
 */
public class TrainStation implements SellTickets {

    @Override
    public void sell() {
        System.out.println("火车站买票");
    }
}
