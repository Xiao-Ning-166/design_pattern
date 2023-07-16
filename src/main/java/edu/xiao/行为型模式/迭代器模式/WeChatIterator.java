package edu.xiao.行为型模式.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体迭代器
 */
public class WeChatIterator implements ProfileIterator {

    /**
     * 当前遍历位置
     */
    private int currentPosition = 0;

    /**
     * 存储对象容器
     */
    private List<Profile> profiles = new ArrayList<>();

    private WeChatCollection weChatCollection;

    public WeChatIterator(WeChatCollection weChatCollection) {
        this.weChatCollection = weChatCollection;
    }

    /**
     * 是否有下一个
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        lazyInit();
        return this.currentPosition < this.profiles.size();
    }

    /**
     * 得到下一个
     *
     * @return
     */
    @Override
    public Profile getNext() {
        if (hasNext()) {
            return this.profiles.get(this.currentPosition++);
        }
        return null;
    }

    private void lazyInit() {
        this.profiles = weChatCollection.getCollection();
    }
}
