package edu.xiao.结构型模式.代理模式.JDK动态代理;

import edu.xiao.结构型模式.代理模式.静态代理.SellTickets;
import edu.xiao.结构型模式.代理模式.静态代理.TrainStation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂 —— 用来创建代理对象
 */
public class ProxyFactory {

    private TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject() {
        /**
         * ClassLoader loader ：类加载器，用于加载代理类，使用真实的对象的类加载器即可
         * Class<?>[] interfaces ：真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
         * nvocationHandler h ：代理对象的调用处理程序
         */
        return (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * proxy: 代理对象
                     * method： 对应于在代理对象中调用的接口方法的 Method 实例
                     * args：代理对象调用接口方法时传递的实际参数
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("收取一定费用（JDK动态代理）");
                        return method.invoke(trainStation, args);
                    }
                }
        );
    }

}
