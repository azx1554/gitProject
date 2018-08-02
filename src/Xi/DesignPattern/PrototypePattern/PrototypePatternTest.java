package Xi.DesignPattern.PrototypePattern;

/**
 * 原型模式：使用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。原型模式是一种对象创建型模式。
 */

/**
 *  一般而言，Java语言中的clone()方法满足：

 (1) 对任何对象x，都有x.clone() != x，即克隆对象与原型对象不是同一个对象；

 (2) 对任何对象x，都有x.clone().getClass() == x.getClass()，即克隆对象与原型对象的类型一样；

 (3) 如果对象x的equals()方法定义恰当，那么x.clone().equals(x)应该成立。
 */
public class PrototypePatternTest {

    public static void main(String[] args) {
        ConcretePrototype obj1 = new ConcretePrototype();
        ConcretePrototype obj2 = obj1.clone();
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

        WeeklyLog log_previous, log_new = null;
        log_previous = new WeeklyLog(); //创建原型对象
        Attachment attachment = new Attachment(); //创建附件对象
        log_previous.setAttachment(attachment);  //将附件添加到周报中
        try {
            log_new = log_previous.deepClone(); //调用深克隆方法创建克隆对象
        } catch (Exception e) {
            System.err.println("克隆失败！");
        }
        //比较周报
        System.out.println("周报是否相同？ " + (log_previous == log_new));
        //比较附件
        System.out.println("附件是否相同？ " + (log_previous.getAttachment() == log_new.getAttachment()));

        System.out.println(log_previous.equals(log_new));
    }
}
