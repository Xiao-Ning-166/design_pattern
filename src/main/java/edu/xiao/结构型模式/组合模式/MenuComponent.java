package edu.xiao.结构型模式.组合模式;

/**
 * 组件类
 */
public abstract class MenuComponent {

    public MenuComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    private String name;

    private int level;

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    MenuComponent getChildren(int index) {
        throw new UnsupportedOperationException();
    }

    void print() {
        throw new UnsupportedOperationException();
    }

}
