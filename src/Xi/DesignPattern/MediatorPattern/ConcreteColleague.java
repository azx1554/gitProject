package Xi.DesignPattern.MediatorPattern;

/**
 * Created by Xi on 2018/5/21.
 */
public class ConcreteColleague extends Colleague {

    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    //实现自身方法
    @Override
    public void method1() {
        System.out.println("调用自身方法");
    }
}
