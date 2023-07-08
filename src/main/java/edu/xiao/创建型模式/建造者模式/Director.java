package edu.xiao.创建型模式.建造者模式;

public class Director {

    public void constructTslCar(Builder builder) {
        builder.setBrand("特斯拉");
        builder.setCarType("轿车");
        builder.setEnergy("新能源");
        builder.setNavigatorType("GPS");
        builder.setSeats(4);
    }

    public void constructBydCar(Builder builder) {
        builder.setBrand("比亚迪");
        builder.setCarType("SUV");
        builder.setEnergy("混动");
        builder.setNavigatorType("北斗");
        builder.setSeats(6);
    }

}
