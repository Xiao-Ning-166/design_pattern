package edu.xiao.结构型模式.外观模式;

public class Client {

    public static void main(String[] args) {
        SmartSpeakerFacade smartSpeakerFacade = new SmartSpeakerFacade();
        smartSpeakerFacade.say("开");

        System.out.println("===================");

        smartSpeakerFacade.say("关");
    }

}
