package edu.xiao.创建型模式.单例模式;

/**
 * 饿汉式单例模式 —— 静态成员变量方式
 * 步骤：
 *      1、私有化构造方法
 *      2、创建公共的静态的本类对象成员变量
 *      3、提供公共的静态的获取实例的方法
 */
public class EagerSingletonTes1 {
    public static void main(String[] args) {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();

        System.out.println(instance1 == instance2);

        System.out.println("===========枚举方式============");

        EagerSingletonEnum instance3 = EagerSingletonEnum.INSTANCE;
        EagerSingletonEnum instance4 = EagerSingletonEnum.INSTANCE;

        System.out.println(instance3 == instance4);
    }
}

class EagerSingleton {

    // 2、创建公共的静态的本类对象
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    // 1、私有化构造方法
    private EagerSingleton() {

    }

    // 4、提供公共的静态的获取实例飞方法
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

}

/**
 * 饿汉式 —— 枚举类方式
 */
enum EagerSingletonEnum {
    INSTANCE;
}
