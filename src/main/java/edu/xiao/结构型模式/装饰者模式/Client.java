package edu.xiao.结构型模式.装饰者模式;

public class Client {

    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource();
        dataSource.writeData("1111");
        dataSource.readData();

        System.out.println("=========加解密========");
        dataSource = new EncryDecorator(dataSource);
        dataSource.writeData("1111");
        dataSource.readData();

        System.out.println("========压缩/解压缩=========");
        dataSource = new CompressionDecorator(dataSource);
        dataSource.writeData("1111");
        dataSource.readData();
    }

}
