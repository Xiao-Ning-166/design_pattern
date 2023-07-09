package edu.xiao.结构型模式.适配器模式.类适配器;

/**
 * SD卡接口
 */
public interface SDCardService {

    String readSD();

    void writeSD(String message);

}
