package Xi.DesignPattern.Decorator;

/**
 * Created by Xi on 2018/4/18.
 */

//文本框类：具体构件类
public class TextBox extends Component {
    @Override
    public void display() {
        System.out.println("显示文本框");
    }
}
