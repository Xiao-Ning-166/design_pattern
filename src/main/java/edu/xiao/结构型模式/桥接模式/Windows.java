package edu.xiao.结构型模式.桥接模式;

/**
 * 精确抽象
 */
public class Windows extends SystemAbstract {

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    void play(String filename) {
        System.out.println("winodws 平台");
        getVideoFile().decode(filename);
    }
}
