package edu.xiao.结构型模式.享元模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂。只需要一个享元工厂，可以使用单例模式
 */
public class TreeTypeFactory {

    private static Map<String, TreeType> treeTypeMap = new HashMap<>();

    private static final TreeTypeFactory instance = new TreeTypeFactory();

    private TreeTypeFactory() {
        if (instance != null) {
            throw new UnsupportedOperationException("不能通过此方式创建实例");
        }
    }

    public static final TreeTypeFactory getInstance() {
        return instance;
    }

    public TreeType getTreeType(String name, String color) {
        TreeType treeType = treeTypeMap.get(name);
        if (treeType == null) {
            treeType = new TreeType(name);
            treeTypeMap.put(name, treeType);
        }
        return treeType;
    }

}
