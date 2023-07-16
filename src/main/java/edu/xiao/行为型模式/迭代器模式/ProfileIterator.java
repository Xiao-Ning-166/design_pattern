package edu.xiao.行为型模式.迭代器模式;

/**
 * 迭代器接口
 */
public interface ProfileIterator {

    /**
     * 是否有下一个
     *
     * @return
     */
    boolean hasNext();

    /**
     * 得到下一个
     *
     * @return
     */
    Profile getNext();

}
