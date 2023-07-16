package edu.xiao.行为型模式.观察者模式;

import java.util.Arrays;

public class Editor {

    private EventManager eventManager;

    public EventManager getEventManager() {
        return eventManager;
    }

    public Editor() {
        this.eventManager = new EventManager(Arrays.asList("open", "save"));
    }

    public void open() {
        this.eventManager.notify("open", "打开文件。。。。。。");
    }

    public void save() {
        this.eventManager.notify("save", "保存文件。。。。。。");
    }
}
