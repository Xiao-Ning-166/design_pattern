package edu.xiao.结构型模式.适配器模式.对象适配器;

/**
 * SD卡实现类
 */
public class SDCardServiceImpl implements SDCardService {

    @Override
    public String readSD() {
        return "read sd card";
    }

    @Override
    public void writeSD(String message) {
        System.out.println("write message to sd card. message: " + message);
    }
}
