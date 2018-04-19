package Xi.DesignPattern.CommandPattern;

import java.util.ArrayList;

/**
 * Created by Xi on 2018/4/19.
 */

/**
 *  有时候我们需要将多个请求排队，当一个请求发送者发送一个请求时，将不止一个请求接收者产生响应，
 *  这些请求接收者将逐个执行业务方法，完成对请求的处理。此时，我们可以通过命令队列来实现。
 */
public class CommandQueue {
    private ArrayList<Command> commands = new ArrayList<Command>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    //循环调用每一个命令对象的execute()方法
    public void execute() {
        for (Object command : commands) {
            ((Command)command).execute();
        }
    }
}
