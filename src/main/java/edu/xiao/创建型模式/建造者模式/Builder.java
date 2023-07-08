package edu.xiao.创建型模式.建造者模式;

/**
 * 抽象建造者
 */
public interface Builder {

    // 汽车类型
    void setCarType(String type);

    // 座椅数
    void setSeats(int seats);

    // 能源方式
    void setEnergy(String energy);

    // 设置品牌
    void setBrand(String brand);

    // 导航类型
    void setNavigatorType(String navigatorType);

}
