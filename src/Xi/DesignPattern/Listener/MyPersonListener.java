package Xi.DesignPattern.Listener;

/**
 * Created by Xi on 2018/4/4.
 */
public class MyPersonListener implements PersonListener {
    @Override
    public void HandleEvent(Event event) {
        String hehavior = event.getBehavior();
        switch (hehavior) {
            case "run" : {
                Person person = event.getPerson();
                //TODO: 这里可以拿到person对象，并做当对象触发run方法时要做的事情
                System.out.println("监听器监听到跑步事件，执行对象跑步前先吃饭");
                person.eat();
            }
            case "eat" : {

            }
            default: break;
        }
    }
}
