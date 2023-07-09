package edu.xiao.结构型模式.适配器模式.对象适配器;

/**
 * 电脑类
 */
public class ComputerClient {

    String readSD(SDCardService sdCardService) {
        return sdCardService.readSD();
    }

    void writeSD(SDCardService sdCardService, String message) {
        sdCardService.writeSD(message);
    }

}
