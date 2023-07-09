package edu.xiao.结构型模式.适配器模式.对象适配器;

/**
 * 适配器类
 */
public class TF2SDAdapter implements SDCardService {

    private TFCardService tfCardService;

    public TF2SDAdapter(TFCardService tfCardService) {
        this.tfCardService = tfCardService;
    }

    @Override
    public String readSD() {
        System.out.println("convert tf to sd");
        return tfCardService.readTF();
    }

    @Override
    public void writeSD(String message) {
        System.out.println("convert tf to sd");
        tfCardService.writeTF(message);
    }
}
