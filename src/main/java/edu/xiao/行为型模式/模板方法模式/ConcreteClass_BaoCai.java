package edu.xiao.行为型模式.模板方法模式;

/**
 * 具体类
 */
public class ConcreteClass_BaoCai extends AbstractClass {

    @Override
    public void step3() {
        System.out.println("放入包菜");
    }

    @Override
    public void step4() {
        System.out.println("放入辣椒");
    }
}
