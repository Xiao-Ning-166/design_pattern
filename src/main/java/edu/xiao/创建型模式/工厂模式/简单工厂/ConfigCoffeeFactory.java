package edu.xiao.创建型模式.工厂模式.简单工厂;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ConfigCoffeeFactory {

    private static Map<String, Coffee> map = new HashMap<>();

    static {
        try {
            InputStream inputStream = ConfigCoffeeFactory.class.getClassLoader().getResourceAsStream("coffee.properties");
            Properties properties = new Properties();
            properties.load(inputStream);

            // 遍历集合
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                // 获取全类名
                String className = properties.getProperty(key.toString());
                Class clazz = Class.forName(className);
                // 通过反射创建对象
                Constructor constructor = clazz.getDeclaredConstructor();
                Coffee coffee = (Coffee) constructor.newInstance();

                map.put(key.toString(), coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Coffee createCoffee(String name) {
        return map.get(name);
    }

}
