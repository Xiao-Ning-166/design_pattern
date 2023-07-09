package edu.xiao.结构型模式.代理模式.静态代理;

/**
 * 代理类
 */
public class TrainStationProxy implements SellTickets {

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("收取一定费用（静态代理）");
        trainStation.sell();
    }
}
