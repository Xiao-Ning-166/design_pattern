package edu.xiao.结构型模式.享元模式;

public class Client {

    public static void main(String[] args) {
        TreeTypeFactory treeTypeFactory = TreeTypeFactory.getInstance();
        TreeType tree1 = treeTypeFactory.getTreeType("杉树", "红");
        TreeType tree2 = treeTypeFactory.getTreeType("杉树", "蓝");

        System.out.println("两棵杉树是否相等：" + (tree1 == tree2));
    }

}
