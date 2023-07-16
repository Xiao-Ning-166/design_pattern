package edu.xiao.行为型模式.迭代器模式;

/**
 * 集合接口
 */
public interface ProfileCollection {

    void addProfile(Profile profile);

    ProfileIterator iterator();

}
