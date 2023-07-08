package edu.xiao.创建型模式.工厂模式.简单工厂;

/**
 * 简单工厂模式
 */
public class TestSimpleFactory {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latte");
        System.out.println(coffee.getName());
    }

}


