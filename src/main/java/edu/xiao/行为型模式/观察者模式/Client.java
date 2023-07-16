package edu.xiao.行为型模式.观察者模式;

/**
 * 测试类
 */
public class Client {

    public static void main(String[] args) {
        Editor editor = new Editor();

        // 添加订阅者
        EventManager eventManager = editor.getEventManager();
        eventManager.addSubscriber("open", new EmailNotificationListener());
        eventManager.addSubscriber("open", new LogOpenListener());
        eventManager.addSubscriber("save", new EmailNotificationListener());

        // 发布消息
        editor.open();
        editor.save();
    }

}
