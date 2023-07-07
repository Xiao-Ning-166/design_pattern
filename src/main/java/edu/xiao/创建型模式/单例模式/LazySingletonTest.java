package edu.xiao.创建型模式.单例模式;

/**
 * 懒汉式单例模式
 */
public class LazySingletonTest {
    public static void main(String[] args) {
        System.out.println("==========线程不安全方式==========");
        LazySingletonUnsafe instance = LazySingletonUnsafe.getInstance();
        LazySingletonUnsafe instance1 = LazySingletonUnsafe.getInstance();
        System.out.println(instance == instance1);

        System.out.println("=========加锁方式==========");
        LazySingletonLock instance2 = LazySingletonLock.getInstance();
        LazySingletonLock instance3 = LazySingletonLock.getInstance();
        System.out.println(instance2 == instance3);

        System.out.println("=========双检锁方式==========");
        LazySingletonDoubleLock instance4 = LazySingletonDoubleLock.getInstance();
        LazySingletonDoubleLock instance5 = LazySingletonDoubleLock.getInstance();
        System.out.println(instance4 == instance5);

        System.out.println("=========静态内部类方式==========");
        LazySingletonInnerClass instance6 = LazySingletonInnerClass.getInstance();
        LazySingletonInnerClass instance7 = LazySingletonInnerClass.getInstance();
        System.out.println(instance6 == instance7);
    }
}

/**
 * 懒汉式 —— 线程不安全
 */
class LazySingletonUnsafe {

    // 私有化构造方法
    private LazySingletonUnsafe() {}

    // 创建静态成员变量
    private static LazySingletonUnsafe instance;

    // 提供公共的静态的获取实例方法
    public static LazySingletonUnsafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonUnsafe();
        }
        return instance;
    }

}

/**
 * 懒汉式 —— 加锁方式
 */
class LazySingletonLock {

    // 私有化构造方法
    private LazySingletonLock() {}

    // 创建私有的静态的成员变量
    private static LazySingletonLock instance;

    // 提供公共的静态的获取实例方法
    public static synchronized LazySingletonLock getInstance() {
        if (instance == null) {
            instance = new LazySingletonLock();
        }

        return instance;
    }

}

/**
 * 懒汉式 —— 双重检查锁方式
 */
class LazySingletonDoubleLock {

    // 私有化构造方法
    private LazySingletonDoubleLock() {}

    // 创建私有的静态的本类型成员变量
    // 问题：为什么要加 volatile？
    // 防止synchronized代码块中指令重排序，线程1先调赋值操作再调构造方法
    // 线程2拿到的引用未完全执行完构造方法
    private static volatile LazySingletonDoubleLock instance;

    // 创建公共的私有的获取实例的方法


    public static LazySingletonDoubleLock getInstance() {
        // 第一次检查，如果instance不为null，不需要竞争锁
        if (instance == null) {
            synchronized (LazySingletonDoubleLock.class) {
                // 第二次检查，获取锁后再次判断instance是否为null
                if (instance == null) {
                    instance = new LazySingletonDoubleLock();
                }
            }
        }
        return instance;
    }
}


/**
 * 懒汉式 —— 静态内部类方式
 */
class LazySingletonInnerClass {

    // 私有化构造方法
    private LazySingletonInnerClass() {}

    // 创建内部类，用于提供实例
    private static class LazyHolder {
        // 创建并初始化外部类的对象
        private static final LazySingletonInnerClass instance = new LazySingletonInnerClass();
    }

    // 创建公共的静态的获取实例方法
    public static LazySingletonInnerClass getInstance() {
        return LazyHolder.instance;
    }

}