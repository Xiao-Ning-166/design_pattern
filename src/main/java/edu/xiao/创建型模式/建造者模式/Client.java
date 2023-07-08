package edu.xiao.创建型模式.建造者模式;

public class Client {

    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        Director director = new Director();
        director.constructTslCar(carBuilder);
        Car tslCar = carBuilder.getResult();
        System.out.println(tslCar);

        System.out.println("=================");
        CarBuilder bydCarBuilder = new CarBuilder();
        director.constructBydCar(bydCarBuilder);
        Car bydCar = bydCarBuilder.getResult();
        System.out.println(bydCar);
    }

}
