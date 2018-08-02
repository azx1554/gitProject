package Xi.DesignPattern.PrototypePattern;

/**
 * 在Java中可以直接使用Object提供的clone()方法来实现对象的克隆，Java语言中的原型模式实现很简单。
 * <p>
 * 需要注意的是能够实现克隆的Java类必须实现一个标识接口Cloneable，表示这个Java类支持被复制。如果一个类没有实现这个接口但是调用了clone()方法，Java编译器将抛出一个CloneNotSupportedException异常
 */
public class ConcretePrototype implements Cloneable {

    //浅克隆
    public ConcretePrototype clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            System.err.println("Not support cloneable");
        }
        return (ConcretePrototype) object;
    }
}
