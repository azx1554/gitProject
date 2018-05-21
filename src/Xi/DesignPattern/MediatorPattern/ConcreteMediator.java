package Xi.DesignPattern.MediatorPattern;

/**
 * Created by Xi on 2018/5/21.
 */
public class ConcreteMediator extends Mediator {


    //实现业务方法，封装同事之间的调用
    @Override
    public void operation() {
        //......
        colleagues.get(0).method1();
        colleagues.get(1).method1();
        //......
    }
}
