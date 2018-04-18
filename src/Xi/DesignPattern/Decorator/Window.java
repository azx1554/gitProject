package Xi.DesignPattern.Decorator;

/**
 * Created by Xi on 2018/4/18.
 */

//窗体类：具体构件类
public class Window extends Component {
    @Override
    public void display() {
        System.out.println("显示窗体");
    }
}
