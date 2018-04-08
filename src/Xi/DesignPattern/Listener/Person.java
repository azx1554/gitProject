package Xi.DesignPattern.Listener;

/**
 * Created by Xi on 2018/4/4.
 */
//事件源
public class Person {

    private PersonListener personListener;

    public void registerListener(PersonListener personListener) {
        this.personListener = personListener;
    }

    public void run() {
        if (personListener != null) {
            Event event = new Event(this, "run");
            personListener.HandleEvent(event);
        }
        System.out.println("跑步");
    }

    public void eat() {
        if (personListener != null) {
            Event event = new Event(this, "eat");
            personListener.HandleEvent(event);
        }
        System.out.println("吃饭");
    }
}
