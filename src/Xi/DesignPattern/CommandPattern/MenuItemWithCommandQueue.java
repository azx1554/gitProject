package Xi.DesignPattern.CommandPattern;

/**
 * Created by Xi on 2018/4/19.
 */
public class MenuItemWithCommandQueue {

    private CommandQueue commandQueue; //维持一个CommandQueue对象的引用

    //构造注入
    public MenuItemWithCommandQueue(CommandQueue commandQueue) {
        this. commandQueue = commandQueue;
    }

    //设值注入
    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    //调用CommandQueue类的execute()方法
    public void call() {
        commandQueue.execute();
    }
}
