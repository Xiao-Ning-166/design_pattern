package edu.xiao.创建型模式.工厂模式.工厂方法模式;

/**
 * 拿铁咖啡对象
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    /**
     * 创建coffee对象
     *
     * @return
     */
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
