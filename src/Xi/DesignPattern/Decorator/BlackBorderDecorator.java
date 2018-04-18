package Xi.DesignPattern.Decorator;

/**
 * Created by Xi on 2018/4/18.
 */

//黑色边框装饰类：具体装饰类
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构件添加黑色边框");
    }
}
