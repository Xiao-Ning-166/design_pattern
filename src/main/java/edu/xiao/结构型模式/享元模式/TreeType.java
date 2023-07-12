package edu.xiao.结构型模式.享元模式;

/**
 * 享元类
 */
public class TreeType {

    private String name;

    public TreeType(String name) {
        this.name = name;
    }

    public void draw(String color, int x, int y) {
        System.out.println("画树，名称：" + name + " 颜色：" + color + " 坐标：(" + x + ", " + y +")");
    }
}
