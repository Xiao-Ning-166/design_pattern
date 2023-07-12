package edu.xiao.行为型模式.模板方法模式;

/**
 * 抽象类
 */
public abstract class AbstractClass {

    /**
     * 模版方法
     */
    public final void templateMethod() {
        // 定义步骤
        step1();
        step2();
        step3();
        step4();
        step5();

    }


    public void step1() {
        System.out.println("倒油");
    }

    public void step2() {
        System.out.println("热油");
    }

    public abstract void step3();

    public abstract void step4();

    public void step5() {
        System.out.println("炒菜");
    }
}
