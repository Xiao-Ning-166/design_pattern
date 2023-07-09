package edu.xiao.结构型模式.装饰者模式;

/**
 * 抽象部件类
 */
public interface DataSource {

    void writeData(String data);

    String readData();

}
