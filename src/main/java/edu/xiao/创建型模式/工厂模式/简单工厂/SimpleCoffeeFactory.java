package edu.xiao.创建型模式.工厂模式.简单工厂;

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
