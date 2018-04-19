package Xi.DesignPattern.CommandPattern;

/**
 * Created by Xi on 2018/4/19.
 */

//请求调用者(Invoker)
public class MenuItem {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}
