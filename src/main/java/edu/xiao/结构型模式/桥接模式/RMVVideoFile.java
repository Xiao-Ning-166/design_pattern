package edu.xiao.结构型模式.桥接模式;

/**
 * 具体实现
 */
public class RMVVideoFile implements VideoFile {

    @Override
    public void decode(String fileName) {
        System.out.println("rmv 格式解码：" + fileName);
    }
}
