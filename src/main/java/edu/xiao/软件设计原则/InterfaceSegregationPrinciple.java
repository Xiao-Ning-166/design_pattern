package edu.xiao.软件设计原则;

/**
 * 接口隔离原则
 */
public class InterfaceSegregationPrinciple {

    public static void main(String[] args) {
        AlibabaCloud alibabaCloud = new AlibabaCloud();
        alibabaCloud.createServer();
        alibabaCloud.listServers();
        alibabaCloud.storeFile();
        alibabaCloud.getFile();
        alibabaCloud.getCDNAddress();

        System.out.println("==================");

        TencentCloud tencentCloud = new TencentCloud();
        tencentCloud.storeFile();
        tencentCloud.getFile();
    }

}

class AlibabaCloud implements CloudHostingProvider, CDNProvider, CloudStorageProvider {

    @Override
    public void createServer() {
        System.out.println("alibaba create server");
    }

    @Override
    public void listServers() {
        System.out.println("alibaba list servers");
    }

    @Override
    public void getCDNAddress() {
        System.out.println("alibaba get cdn address");
    }

    @Override
    public void storeFile() {
        System.out.println("alibaba store file");
    }

    @Override
    public void getFile() {
        System.out.println("alibaba get file");
    }
}

class TencentCloud implements CloudStorageProvider {

    @Override
    public void storeFile() {
        System.out.println("Tencent store file");
    }

    @Override
    public void getFile() {
        System.out.println("Tencent get file");
    }
}

interface CloudHostingProvider {

    void createServer();

    void listServers();

}

interface CDNProvider {

    void getCDNAddress();
}

interface CloudStorageProvider {

    void storeFile();

    void getFile();

}