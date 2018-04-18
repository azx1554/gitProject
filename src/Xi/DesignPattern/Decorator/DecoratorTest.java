package Xi.DesignPattern.Decorator;

/**
 * Created by Xi on 2018/4/18.
 */

/**
 *   装饰模式(Decorator Pattern)：动态地给一个对象增加一些额外的职责，就增加对象功能来说，装饰模式比生成子类实现更为灵活。
 *
 *   装饰模式是一种用于替代继承的技术,降低了系统的耦合度，可以动态增加或删除对象的职责，并使得需要装饰的具体构件类和具体装饰类可以独立变化，
 *   以便增加新的具体构件类和具体装饰类。在软件开发中，装饰模式应用较为广泛,例如在JavaIO中的输入流和输出流的设计、javax.swing包中一些图形界面构件功能的增强等地方都运用了装饰模式。
 */

/**
 *在以下情况下可以考虑使用装饰模式：

 (1) 在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。

 (2) 当不能采用继承的方式对系统进行扩展或者采用继承不利于系统扩展和维护时可以使用装饰模式。不能采用继承的情况主要有两类：第一类是系统中存在大量独立的扩展，
 为支持每一种扩展或者扩展之间的组合将产生大量的子类，使得子类数目呈爆炸性增长；第二类是因为类已定义为不能被继承（如Java语言中的final类）。
 */

public class DecoratorTest {

    public static void main(String[] args) {
        Component window = new Window();
        Component windowWithSB = new ScrollBarDecorator(window);
        Component windowWithSBAndBB = new BlackBorderDecorator(windowWithSB);
        window.display();
        windowWithSB.display();
        windowWithSBAndBB.display();
    }
}
