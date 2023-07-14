package edu.xiao.行为型模式.策略模式;

/**
 * 上下文
 */
public class PayContext {

    private PayStrategy payStrategy;

    public PayContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void pay(int amount) {
        payStrategy.pay(amount);
    }
}
