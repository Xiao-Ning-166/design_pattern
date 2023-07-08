package edu.xiao.创建型模式.建造者模式;

/**
 * 产品
 */
public class Car {

    private String type;

    private int seats;

    private String energy;

    private String brand;

    private String navigatorType;

    public Car(String type, int seats, String energy, String brand, String navigatorType) {
        this.type = type;
        this.seats = seats;
        this.energy = energy;
        this.brand = brand;
        this.navigatorType = navigatorType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", seats=" + seats +
                ", energy='" + energy + '\'' +
                ", brand='" + brand + '\'' +
                ", navigatorType='" + navigatorType + '\'' +
                '}';
    }
}
