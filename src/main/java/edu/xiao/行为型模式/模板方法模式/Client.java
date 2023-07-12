package edu.xiao.行为型模式.模板方法模式;

public class Client {

    public static void main(String[] args) {
        AbstractClass baiCai = new ConcreteClass_BaiCai();
        baiCai.templateMethod();

        System.out.println("===================");

        AbstractClass baoCai = new ConcreteClass_BaoCai();
        baoCai.templateMethod();
    }

}
