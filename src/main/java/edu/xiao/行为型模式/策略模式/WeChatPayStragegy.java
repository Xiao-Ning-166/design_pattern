package edu.xiao.行为型模式.策略模式;

/**
 * 具体策略
 */
public class WeChatPayStragegy implements PayStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("微信支付，金额：" + amount);
    }
}
