package edu.xiao.结构型模式.适配器模式.类适配器;

/**
 * 适配器类
 */
public class TF2SDAdapter extends TFCardServiceImpl implements SDCardService {

    @Override
    public String readSD() {
        System.out.println("convert tf to sd");
        return readTF();
    }

    @Override
    public void writeSD(String message) {
        System.out.println("convert tf to sd");
        writeTF(message);
    }
}
