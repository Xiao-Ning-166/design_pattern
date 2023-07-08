package edu.xiao.创建型模式.建造者模式;

/**
 * 具体建造者
 */
public class CarBuilder implements Builder {

    private String type;

    private int seats;

    private String energy;

    private String brand;

    private String navigatorType;

    @Override
    public void setCarType(String type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEnergy(String energy) {
        this.energy = energy;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setNavigatorType(String navigatorType) {
        this.navigatorType = navigatorType;
    }

    public Car getResult() {
        return new Car(this.type, this.seats, this.energy, this.brand, this.navigatorType);
    }
}
