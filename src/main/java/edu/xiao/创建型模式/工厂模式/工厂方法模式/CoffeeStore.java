package edu.xiao.创建型模式.工厂模式.工厂方法模式;

class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {
        return coffeeFactory.createCoffee();
    }
}
