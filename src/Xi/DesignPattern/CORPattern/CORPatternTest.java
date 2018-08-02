package Xi.DesignPattern.CORPattern;

/**
 * 职责链模式(Chain of Responsibility  Pattern)：避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。职责链模式是一种对象行为型模式。
 * <p>
 * 在职责链模式里，很多对象由每一个对象对其下家的引用而连接起来形成一条链。请求在这个链上传递，直到链上的某一个对象决定处理此请求。
 * 发出这个请求的客户端并不知道链上的哪一个对象最终处理这个请求，这使得系统可以在不影响客户端的情况下动态地重新组织链和分配责任
 * <p>
 * 职责链模式并不创建职责链，职责链的创建工作必须由系统的其他部分来完成，一般是在使用该职责链的客户端中创建职责链。
 */

/**
 *  职责链模式的主要优点如下：

 (1) 职责链模式使得一个对象无须知道是其他哪一个对象处理其请求，对象仅需知道该请求会被处理即可，接收者和发送者都没有对方的明确信息，且链中的对象不需要知道链的结构，由客户端负责链的创建，降低了系统的耦合度。

 (2) 请求处理对象仅需维持一个指向其后继者的引用，而不需要维持它对所有的候选处理者的引用，可简化对象的相互连接。

 (3) 在给对象分派职责时，职责链可以给我们更多的灵活性，可以通过在运行时对该链进行动态的增加或修改来增加或改变处理一个请求的职责。

 (4) 在系统中增加一个新的具体请求处理者时无须修改原有系统的代码，只需要在客户端重新建链即可，从这一点来看是符合“开闭原则”的。
 */
public class CORPatternTest {

    public static void main(String[] args) {
        Approver wjzhang, gyang, jguo, meeting;
        wjzhang = new Director("张无忌");
        jguo = new President("郭靖");
        meeting = new Congress("董事会");

        //创建职责链
        wjzhang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);

        //创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(45000, 10001, "购买倚天剑");
        wjzhang.processRequest(pr1);

        PurchaseRequest pr3 = new PurchaseRequest(160000, 10003, "购买《金刚经》");
        wjzhang.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(800000, 10004, "购买桃花岛");
        wjzhang.processRequest(pr4);
    }
}
