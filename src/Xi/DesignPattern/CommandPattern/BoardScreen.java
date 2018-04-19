package Xi.DesignPattern.CommandPattern;

/**
 * Created by Xi on 2018/4/19.
 */

//请求接收者(Receiver)
public class BoardScreen {

    public void open() {
        System.out.println("打开公告板");
    }

    public void edit() {
        System.out.println("编辑公告板");
    }

    public void create() {
        System.out.println("新建公告板");
    }
}
