package edu.xiao.行为型模式.策略模式;

/**
 * 具体策略
 */
public class AiPayStragegy implements PayStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("支付宝支付，金额：" + amount);
    }
}
