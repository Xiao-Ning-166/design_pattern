package edu.xiao.行为型模式.观察者模式;

/**
 * 具体观察者（订阅者）
 */
public class LogOpenListener implements EventListener {

    @Override
    public void update(String message) {
        System.out.println("接收到的消息：" + message);
        System.out.println("记录日志");
    }
}
