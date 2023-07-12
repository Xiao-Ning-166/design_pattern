package edu.xiao.行为型模式.模板方法模式;

/**
 * 具体类
 */
public class ConcreteClass_BaiCai extends AbstractClass {

    @Override
    public void step3() {
        System.out.println("放入白菜");
    }

    @Override
    public void step4() {
        System.out.println("放入蒜蓉");
    }
}
