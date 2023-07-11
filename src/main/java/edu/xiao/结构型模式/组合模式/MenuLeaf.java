package edu.xiao.结构型模式.组合模式;

/**
 * 叶子节点
 */
public class MenuLeaf extends MenuComponent {

    public MenuLeaf(String name, int level) {
        super(name, level);
    }

    @Override
    void print() {
        int level = super.getLevel();
        for (int i = 1; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println(super.getName());
    }
}
