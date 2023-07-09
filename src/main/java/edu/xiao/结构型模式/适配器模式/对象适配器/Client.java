package edu.xiao.结构型模式.适配器模式.对象适配器;


public class Client {

    public static void main(String[] args) {
        ComputerClient computerClient = new ComputerClient();
        String msg1 = computerClient.readSD(new SDCardServiceImpl());
        System.out.println(msg1);

        System.out.println("=================");
        TFCardService tfCardService = new TFCardServiceImpl();
        SDCardService tf2SDAdapter = new TF2SDAdapter(tfCardService);
        String msg2 = computerClient.readSD(tf2SDAdapter);
        System.out.println(msg2);

    }

}
