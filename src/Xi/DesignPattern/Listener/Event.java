package Xi.DesignPattern.Listener;

/**
 * Created by Xi on 2018/4/4.
 */
//事件对象
public class Event {

    private Person person;
    private String behavior;

    public Event(Person person, String behavior) {
        this.person = person;
        this.behavior = behavior;
    }

    public Person getPerson() {
        return person;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
