package edu.xiao.结构型模式.适配器模式.类适配器;

/**
 * TF卡实现类
 */
public class TFCardServiceImpl implements TFCardService {

    @Override
    public String readTF() {
        return "read tf card";
    }

    @Override
    public void writeTF(String message) {
        System.out.println("write message to tf card. message: " + message);
    }
}
