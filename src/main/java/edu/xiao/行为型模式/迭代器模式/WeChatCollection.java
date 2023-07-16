package edu.xiao.行为型模式.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体集合
 */
public class WeChatCollection implements ProfileCollection {

    private List<Profile> profiles;

    public WeChatCollection() {
        this.profiles = new ArrayList<>();
    }

    @Override
    public void addProfile(Profile profile) {
        profiles.add(profile);
    }

    @Override
    public ProfileIterator iterator() {
        return new WeChatIterator(this);
    }

    public List<Profile> getCollection() {
        return profiles;
    }
}
