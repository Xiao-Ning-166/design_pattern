package edu.xiao.创建型模式.工厂模式.简单工厂;

public class TestConfigFactory {

    public static void main(String[] args) {
        Coffee americano = ConfigCoffeeFactory.createCoffee("americano");
        System.out.println(americano.getName());

        System.out.println("================");

        Coffee latte = ConfigCoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());

    }

}
