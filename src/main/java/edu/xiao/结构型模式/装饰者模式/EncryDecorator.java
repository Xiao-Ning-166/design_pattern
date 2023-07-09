package edu.xiao.结构型模式.装饰者模式;

/**
 * 具体装饰器 —— 加解密
 */
public class EncryDecorator extends DataSourceDecorator {
    public EncryDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        System.out.println("加密文件。。。。。。");
        super.writeData(data);
    }

    @Override
    public String readData() {
        String msg = super.readData();
        System.out.println("解密文件。。。。。。");
        return msg;
    }
}
