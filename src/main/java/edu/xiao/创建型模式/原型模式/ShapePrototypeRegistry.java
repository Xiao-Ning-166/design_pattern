package edu.xiao.创建型模式.原型模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型注册站
 */
public class ShapePrototypeRegistry {

    private Map<String, ShapePrototype> prototypeRegistry;

    public ShapePrototypeRegistry() {
        prototypeRegistry = new HashMap<>();

        ShapePrototype rectangle = new RectangleShape();
        prototypeRegistry.put("rectangle", rectangle);

        ShapePrototype circle = new CircleShape();
        prototypeRegistry.put("circle", circle);
    }

    public ShapePrototype getShape(String name) {
        return prototypeRegistry.get(name);
    }
}
