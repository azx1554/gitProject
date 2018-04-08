package Xi.DesignPattern.ObserverPattern;

/**
 * Created by Xi on 2018/4/8.
 */
public interface Observerable {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
