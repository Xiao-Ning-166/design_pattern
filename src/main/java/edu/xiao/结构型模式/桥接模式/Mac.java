package edu.xiao.结构型模式.桥接模式;

/**
 * 精确抽象
 */
public class Mac extends SystemAbstract {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    void play(String filename) {
        System.out.println("Mac 平台");
        getVideoFile().decode(filename);
    }
}
