package edu.xiao.结构型模式.代理模式.CGLib动态代理;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * 代理工厂 —— 用来创建代理对象
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject() {
        // 创建Enhancer对象，类似于 JDK动态代理的 Proxy对象
        Enhancer enhancer = new Enhancer();
        // 设置父类字节码对象
        enhancer.setSuperclass(trainStation.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        return (TrainStation) enhancer.create();
    }

    /**
     * @param o           代理对象
     * @param method      真实对象中的Method方法实例
     * @param objects     实际参数
     * @param methodProxy 代理对象中的Method实例
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("收取一定费用（CGLib动态代理）");
        return method.invoke(o, objects);
    }
}
