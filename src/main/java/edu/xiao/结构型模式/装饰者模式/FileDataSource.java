package edu.xiao.结构型模式.装饰者模式;

/**
 * 具体部件
 */
public class FileDataSource implements DataSource {

    @Override
    public void writeData(String data) {
        System.out.println("向文件中写数据");
    }

    @Override
    public String readData() {
        System.out.println("从文件中读数据");
        return "从文件中读数据";
    }
}
