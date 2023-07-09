package edu.xiao.结构型模式.适配器模式.类适配器;

/**
 * TF卡接口
 */
public interface TFCardService {

    String readTF();

    void writeTF(String message);

}
