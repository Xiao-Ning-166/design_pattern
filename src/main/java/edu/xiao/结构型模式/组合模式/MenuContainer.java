package edu.xiao.结构型模式.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器
 */
public class MenuContainer extends MenuComponent {

    private List<MenuComponent> children;

    public MenuContainer(String name, int level) {
        super(name, level);
        children = new ArrayList<>();
    }

    @Override
    void add(MenuComponent menuComponent) {
        children.add(menuComponent);
    }

    @Override
    void remove(MenuComponent menuComponent) {
        children.remove(menuComponent);
    }

    @Override
    MenuComponent getChildren(int index) {
        return children.get(index);
    }

    @Override
    void print() {
        int level = super.getLevel();
        for (int i = 1; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println(super.getName());
        // 打印子结点
        for (MenuComponent child : children) {
            child.print();
        }
    }
}
