package Xi.DesignPattern.Decorator;

/**
 * Created by Xi on 2018/4/18.
 */

//滚动条装饰类：具体装饰类
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条");
    }
}
