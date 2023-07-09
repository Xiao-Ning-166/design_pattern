package edu.xiao.结构型模式.桥接模式;

public class Client {

    public static void main(String[] args) {
        VideoFile avi = new AVIVideoFile();
        SystemAbstract windows = new Windows(avi);
        windows.play("波多老师");

        System.out.println("==========================");

        VideoFile rmv = new RMVVideoFile();
        SystemAbstract mac = new Mac(rmv);
        mac.play("吉泽老师");
    }

}
