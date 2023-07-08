package edu.xiao.创建型模式.工厂模式.抽象工厂模式;

/**
 * 具体工厂 —— 生产苹果产品的工厂
 */
public class AppleProductFactory implements ProductFactory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Pad createPad() {
        return new ApplePad();
    }
}
