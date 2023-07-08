package edu.xiao.创建型模式.原型模式;

/**
 * 抽象原型类
 */
public abstract class ShapePrototype implements Cloneable {

    public abstract String getName();

    /**
     * 克隆方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected ShapePrototype clone() throws CloneNotSupportedException {
        return (ShapePrototype) super.clone();
    }
}
