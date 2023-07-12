package edu.xiao.结构型模式.享元模式;

/**
 * 情景类
 */
public class Tree {

    private String color;

    private int x;

    private int y;

    private TreeType treeType;

    public Tree(int x, int y, String color, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.treeType = treeType;
    }

    public void draw() {
        treeType.draw(color, x, y);
    }
}
