package edu.xiao.行为型模式.迭代器模式;

/**
 * 测试
 */
public class Client {

    public static void main(String[] args) {
        ProfileCollection webChat = new WeChatCollection();
        webChat.addProfile(new Profile("001", "1111"));
        webChat.addProfile(new Profile("002", "2222"));
        webChat.addProfile(new Profile("003", "3333"));

        ProfileIterator iterator = webChat.iterator();

        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            System.out.println(profile);
        }
    }

}
