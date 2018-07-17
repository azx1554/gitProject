package Xi.DesignPattern.FacadePattern;

/**
 外观模式中，一个子系统的外部与其内部的通信通过一个统一的外观类进行，外观类将客户类与子系统的内部复杂性分隔开，使得客户类只需要与外观角色打交道，而不需要与子系统内部的很多对象打交道。

 外观模式：为子系统中的一组接口提供一个统一的入口。外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。

 外观模式又称为门面模式，它是一种对象结构型模式。外观模式是迪米特法则的一种具体实现，通过引入一个新的外观角色可以降低原有系统的复杂度，同时降低客户类与子系统的耦合度。

 */
public class FacadePatternTest {

    public static void main(String[] args) {
        ClientServerFacade A;
        String advertisement = "java设计模式，价格29元，联系电话15623785929";
        A = new ClientServerFacade(advertisement);
        A.doadvertisement();
    }
}
