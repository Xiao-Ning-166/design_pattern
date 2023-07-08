package edu.xiao.创建型模式.工厂模式.简单工厂;

/**
 * 咖啡店
 */
class CoffeeStore {

    public Coffee orderCoffee(String name) {
        SimpleCoffeeFactory coffeeFactory = new SimpleCoffeeFactory();
        return coffeeFactory.createCoffee(name);
    }

}
