package edu.xiao.结构型模式.桥接模式;

/**
 * 抽象部分
 */
public abstract class SystemAbstract {

    private VideoFile videoFile;

    public VideoFile getVideoFile() {
        return videoFile;
    }

    public SystemAbstract(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    abstract void play(String filename);
}
