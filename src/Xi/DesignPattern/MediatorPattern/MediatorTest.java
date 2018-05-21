package Xi.DesignPattern.MediatorPattern;

/**
 * Created by Xi on 2018/5/21.
 */

/**
 * 中介者模式(Mediator Pattern)：用一个中介对象（中介者）来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，
 * 从而使其耦合松散，而且可以独立地改变它们之间的交互。中介者模式又称为调停者模式，它是一种对象行为型模式。
 */

/**
 * 中介者模式将一个网状的系统结构变成一个以中介者对象为中心的星形结构，在这个星型结构中，使用中介者对象与其他对象的一对多关系来取代原有对象之间的多对多关系。
 * 中介者模式在事件驱动类软件中应用较为广泛，特别是基于GUI（Graphical User Interface，图形用户界面）的应用软件，此外，在类与类之间存在错综复杂的关联关系的系统中，中介者模式都能得到较好的应用。
 */
/**
 * 中介者模式的主要优点如下：
 (1) 中介者模式简化了对象之间的交互，它用中介者和同事的一对多交互代替了原来同事之间的多对多交互，一对多关系更容易理解、维护和扩展，将原本难以理解的网状结构转换成相对简单的星型结构。
 (2) 中介者模式可将各同事对象解耦。中介者有利于各同事之间的松耦合，我们可以独立的改变和复用每一个同事和中介者，增加新的中介者和新的同事类都比较方便，更好地符合“开闭原则”。
 (3) 可以减少子类生成，中介者将原本分布于多个对象间的行为集中在一起，改变这些行为只需生成新的中介者子类即可，这使各个同事类可被重用，无须对同事类进行扩展。
 */

public class MediatorTest {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague colleagueA = new ConcreteColleague(mediator);
        Colleague colleagueB = new ConcreteColleague(mediator);

        mediator.register(colleagueA);
        mediator.register(colleagueB);

        colleagueA.method2();
        colleagueB.method2();
    }

}
