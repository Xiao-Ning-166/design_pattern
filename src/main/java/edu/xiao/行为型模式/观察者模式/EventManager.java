package edu.xiao.行为型模式.观察者模式;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 事件管理者
 */
public class EventManager {

    private Map<String, List<EventListener>> listeners;

    public EventManager(List<String> events) {
        this.listeners = new HashMap<>();
        for (String event : events) {
            this.listeners.put(event, new ArrayList<>());
        }
    }

    /**
     * 添加观察者（订阅者）
     *
     * @param event
     * @param eventListener
     */
    public void addSubscriber(String event, EventListener eventListener) {
        List<EventListener> eventListeners = this.listeners.get(event);
        eventListeners.add(eventListener);
    }

    /**
     * 删除观察者（订阅者）
     *
     * @param event
     * @param eventListener
     */
    public void removeSubscriber(String event, EventListener eventListener) {
        List<EventListener> eventListeners = this.listeners.get(event);
        eventListeners.remove(eventListener);
    }

    /**
     * 通知观察者（订阅者）
     *
     * @param event
     */
    public void notify(String event, String message) {
        List<EventListener> eventListeners = this.listeners.get(event);
        for (EventListener eventListener : eventListeners) {
            eventListener.update(message);
        }
    }
}
