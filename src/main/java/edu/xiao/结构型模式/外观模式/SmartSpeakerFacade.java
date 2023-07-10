package edu.xiao.结构型模式.外观模式;

/**
 * 外观类
 */
public class SmartSpeakerFacade {

    private Light light;

    private TV tv;

    private AirConfition airConfition;

    public SmartSpeakerFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airConfition = new AirConfition();
    }

    public void say(String msg) {
        if (msg.contains("开")) {
            onAll();
        } else if (msg.contains("关")) {
            offAll();
        } else {
            System.out.println("听不懂捏");
        }
    }

    private void onAll() {
        light.on();
        tv.on();
        airConfition.on();
    }

    private void offAll() {
        light.off();
        tv.off();
        airConfition.off();
    }
}
