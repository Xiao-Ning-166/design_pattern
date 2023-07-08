package edu.xiao.创建型模式.工厂模式.工厂方法模式;

/**
 * 美式咖啡工厂
 */
public class AmericanoCoffeeFatory implements CoffeeFactory {
    /**
     * 创建coffee对象
     *
     * @return
     */
    @Override
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }
}
