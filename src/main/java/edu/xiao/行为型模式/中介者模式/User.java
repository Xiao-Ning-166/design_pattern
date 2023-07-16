package edu.xiao.行为型模式.中介者模式;

/**
 * 组件类
 */
public class User {

    public String name;

    private Mediator chatRoomMediator;

    public User(String name, Mediator chatRoomMediator) {
        this.name = name;
        this.chatRoomMediator = chatRoomMediator;
    }

    public void sendMessage(String message) {
        this.chatRoomMediator.notify(this, message);
    }
}
