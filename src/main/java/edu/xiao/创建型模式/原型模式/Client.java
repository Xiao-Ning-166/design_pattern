package edu.xiao.创建型模式.原型模式;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShapePrototypeRegistry shapePrototypeRegistry = new ShapePrototypeRegistry();
        ShapePrototype rectangle = shapePrototypeRegistry.getShape("rectangle");
        System.out.println(rectangle.getName());

        System.out.println("==================");
        ShapePrototype circle = shapePrototypeRegistry.getShape("circle");
        System.out.println(circle.getName());

        ShapePrototype clone = circle.clone();

        System.out.println(circle == clone);
    }

}
