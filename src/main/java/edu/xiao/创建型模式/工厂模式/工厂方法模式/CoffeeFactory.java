package edu.xiao.创建型模式.工厂模式.工厂方法模式;

/**
 * 角色：抽象工厂
 */
public interface CoffeeFactory {

    /**
     * 创建coffee对象
     *
     * @return
     */
    Coffee createCoffee();

}
