package edu.xiao.创建型模式.工厂模式;

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

/**
 * 咖啡店
 */
class CoffeeStore {

    public Coffee orderCoffee(String name) {
        SimpleCoffeeFactory coffeeFactory = new SimpleCoffeeFactory();
        return coffeeFactory.createCoffee(name);
    }

}

/**
 * 咖啡工厂
 */
class SimpleCoffeeFactory {

    public Coffee createCoffee(String name) {
        switch (name) {
            case "americano":
                return new AmericanoCoffee();
            case "latte":
                return new LatteCoffee();
            default:
                throw new IllegalArgumentException("暂未提供这种咖啡");
        }
    }

}

abstract class Coffee {

    public abstract String getName();

}

class AmericanoCoffee extends Coffee {

    @Override
    public String getName() {
        return "美式咖啡";
    }
}

class LatteCoffee extends Coffee {

    @Override
    public String getName() {
        return "拿铁咖啡";
    }
}


