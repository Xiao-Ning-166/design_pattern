package edu.xiao.创建型模式.工厂模式.抽象工厂模式;

/**
 * 具体工厂 —— 生产华为产品的工厂
 */
public class HuaweiProductFactory implements ProductFactory {

    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Pad createPad() {
        return new HuaweiPad();
    }
}
