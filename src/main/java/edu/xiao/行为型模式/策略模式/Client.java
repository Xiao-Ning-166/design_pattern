package edu.xiao.行为型模式.策略模式;

public class Client {

    public static void main(String[] args) {

        PayContext payContext = new PayContext(new AiPayStragegy());
        payContext.pay(100);

        System.out.println("============");

        payContext = new PayContext(new WeChatPayStragegy());
        payContext.pay(200);
    }

}
