package edu.xiao.结构型模式.装饰者模式;

import java.sql.Wrapper;

/**
 * 抽象装饰器
 */
public abstract class DataSourceDecorator implements DataSource {

    private DataSource wrappee;

    public DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
