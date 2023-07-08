package edu.xiao.创建型模式.工厂模式.工厂方法模式;

/**
 * 工厂方法模式
 */
public class TestFactoryMethod {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        CoffeeFactory am = new AmericanoCoffeeFatory();
        coffeeStore.setCoffeeFactory(am);
        Coffee coffee = coffeeStore.orderCoffee();

        System.out.println(coffee.getName());

        System.out.println("=============");

        CoffeeFactory lc = new LatteCoffeeFactory();
        coffeeStore.setCoffeeFactory(lc);
        Coffee coffee1 = coffeeStore.orderCoffee();
        System.out.println(coffee1.getName());
    }

}

