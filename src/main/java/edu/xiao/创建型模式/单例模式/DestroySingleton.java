package edu.xiao.创建型模式.单例模式;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DestroySingleton {

    public static void main(String[] args) throws Exception {
        System.out.println("反序列化方式破坏");
        destroy1();

        System.out.println("反射方式破坏");
        destroy2();
    }

    private static void destroy2() throws Exception {
        // 获取类对象
        Class<Singleton> clazz = Singleton.class;
        // 获取构造方法
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        // 修改访问限制
        constructor.setAccessible(true);
        // 获取实例
        Singleton instance1 = constructor.newInstance();
        Singleton instance2 = constructor.newInstance();

        System.out.println(instance1 == instance2);
    }

    /**
     * 反序列化破坏
     */
    private static void destroy1() throws Exception {
        // 将对象写入文件
        writeObject2File();

        Singleton instance1 = readObjectFromFile();
        Singleton instance2 = readObjectFromFile();

        System.out.println(instance1 == instance2);

    }

    private static Singleton readObjectFromFile() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.text"));
        Singleton instance = (Singleton) ois.readObject();
        ois.close();
        return instance;
    }

    private static void writeObject2File() throws Exception {

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("a.text"));
        // 获取对象
        Singleton instance = Singleton.getInstance();
        // 写出文件
        out.writeObject(instance);
        // 释放资源
        out.close();

    }

}

/**
 * 懒汉式 —— 双重检查锁方式
 */
class Singleton implements Serializable {

    // 私有化构造方法
    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("单例模式禁止反射创建实例！");
        }
    }

    // 创建私有的静态的本类型成员变量
    private static volatile Singleton instance;

    // 创建公共的私有的获取实例的方法


    public static Singleton getInstance() {
        // 第一次检查，如果instance不为null，不需要竞争锁
        if (instance == null) {
            synchronized (LazySingletonDoubleLock.class) {
                // 第二次检查，获取锁后再次判断instance是否为null
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /**
     * 解决反序列化破坏单例模式。
     * 当进行反序列化是，会自动调用该方法，将该方法的返回值直接返回
     *
     * @return
     */
    public Object readResolve() {
        return instance;
    }
}
