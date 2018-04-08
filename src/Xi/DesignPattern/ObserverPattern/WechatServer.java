package Xi.DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xi on 2018/4/8.
 */
public class WechatServer implements Observerable {

    private List<Observer> observers = new ArrayList<>();
    private static WechatServer instance;

    private WechatServer() {}

    public static synchronized WechatServer getInstance() {
        if (instance == null)
            instance = new WechatServer();
        return instance;
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer != null)
            observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observer != null)
            observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update();
        }
    }

    public void setImformation(String message) {
        System.out.println("微信平台发生更新:" + message);
        notifyObserver();
    }
}
