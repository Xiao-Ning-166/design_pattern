package edu.xiao.结构型模式.装饰者模式;

/**
 * 具体装饰类 —— 压缩、解压缩
 */
public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        System.out.println("压缩。。。。。。");
        super.writeData(data);
    }

    @Override
    public String readData() {
        String msg = super.readData();
        System.out.println("解压缩。。。。。。");
        return msg;
    }
}
