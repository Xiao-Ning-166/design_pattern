package edu.xiao.创建型模式.单例模式;

public class EagerSingletonTes2 {
    public static void main(String[] args) {
        EagerSingleton2 instance1 = EagerSingleton2.getInstance();
        EagerSingleton2 instance2 = EagerSingleton2.getInstance();

        System.out.println(instance1 == instance2);
    }
}

/**
 * 饿汉式单例模式 —— 静态成员代码块方式
 * 步骤：
 *      1、私有化构造方法
 *      2、创建公共的静态的本类对象成员变量
 *      3、静态代码块中对成员变量赋值
 *      4、提供公共的静态的获取实例的方法
 */
class EagerSingleton2 {

    // 2、创建公共的静态的本类对象
    private static final EagerSingleton2 INSTANCE;

    // 3、静态代码块中赋值
    static {
        INSTANCE = new EagerSingleton2();
    }

    // 1、私有化构造方法
    private EagerSingleton2() {

    }

    // 4、提供公共的静态的获取实例方法
    public static EagerSingleton2 getInstance() {
        return INSTANCE;
    }

}
