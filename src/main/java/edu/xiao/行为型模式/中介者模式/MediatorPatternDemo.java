package edu.xiao.行为型模式.中介者模式;

/**
 * 测试类
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        Mediator chatRoom = new ChatRoomMediator();

        User u1 = new User("张三", chatRoom);
        u1.sendMessage("你好，我是张三");

        User u2 = new User("李四", chatRoom);
        u2.sendMessage("张三你好，我是李四");
    }

}
