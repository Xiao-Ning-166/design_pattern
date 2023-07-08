package edu.xiao.创建型模式.工厂模式.抽象工厂模式;

public class Client {

    public static void main(String[] args) {
        System.out.println("华为产品");
        ProductFactory huawei = new HuaweiProductFactory();
        Phone huaweiPhone = huawei.createPhone();
        Pad huaweiPad = huawei.createPad();
        System.out.println(huaweiPhone.getName());
        System.out.println(huaweiPad.getName());

        System.out.println("==============");

        System.out.println("苹果产品");
        ProductFactory apple = new AppleProductFactory();
        Phone applePhone = apple.createPhone();
        Pad applePad = apple.createPad();
        System.out.println(applePhone.getName());
        System.out.println(applePad.getName());
    }

}
