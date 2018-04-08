package Xi.DesignPattern.ObserverPattern;

/**
 * Created by Xi on 2018/4/8.
 */
public class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("用户" + name + "收到更新消息");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
