package edu.xiao.结构型模式.适配器模式.类适配器;

public class Client {

    public static void main(String[] args) {
        ComputerClient computerClient = new ComputerClient();
        String msg1 = computerClient.readSD(new SDCardServiceImpl());
        System.out.println(msg1);

        System.out.println("=================");

        String msg2 = computerClient.readSD(new TF2SDAdapter());
        System.out.println(msg2);

    }

}
