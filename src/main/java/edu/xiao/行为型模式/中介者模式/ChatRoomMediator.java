package edu.xiao.行为型模式.中介者模式;

/**
 * 具体中介者
 */
public class ChatRoomMediator implements Mediator {

    @Override
    public void notify(User sender, String message) {
        System.out.println(sender.name + " 发送了消息：" + message);
    }
}
