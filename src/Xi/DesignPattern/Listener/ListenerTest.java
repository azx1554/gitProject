package Xi.DesignPattern.Listener;

/**
 * Created by Xi on 2018/4/4.
 */
public class ListenerTest {
    public static void main(String[] args) {
        Person person = new Person();
        PersonListener personListener = new MyPersonListener();
        person.registerListener(personListener);
        person.run();
    }
}
