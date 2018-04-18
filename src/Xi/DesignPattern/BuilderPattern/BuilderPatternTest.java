package Xi.DesignPattern.BuilderPattern;

/**
 * Created by Xi on 2018/4/17.
 */

/**
 * 建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。是较为复杂的创建型模式，
 * 它将客户端与包含多个组成部分（或部件）的复杂对象的创建过程分离，客户端无须知道复杂对象的内部组成部分与装配方式，
 * 只需要知道所需建造者的类型即可。它关注如何一步一步创建一个的复杂对象，不同的具体建造者定义了不同的创建过程，
 * 且具体建造者相互独立，增加新的建造者非常方便，无须修改已有代码，系统具有较好的扩展性。
 */

/**
 * 在以下情况下可以考虑使用建造者模式：

 (1) 需要生成的产品对象有复杂的内部结构，这些产品对象通常包含多个成员属性。

 (2) 需要生成的产品对象的属性相互依赖，需要指定其生成顺序。

 (3) 对象的创建过程独立于创建该对象的类。在建造者模式中通过引入了指挥者类，将创建过程封装在指挥者类中，而不在建造者类和客户类中。

 (4) 隔离复杂对象的创建和使用，并使得相同的创建过程可以创建不同的产品。
 */
public class BuilderPatternTest {

    public static void main(String[] args) {
        ActorBuilder angelBuilder = new AngelBuilder();
        ActorBuilder devilBuilder = new DevilBuilder();
        Actor angel = ActorController.construct(angelBuilder);
        Actor devil = ActorController.construct(devilBuilder);
        String type = angel.getType();
        System.out.println(type + "的外观：");
        System.out.println("性别：" + angel.getSex());
        System.out.println("面容：" + angel.getFace());
        System.out.println("服装：" + angel.getCostume());
        System.out.println("发型：" + angel.getHairstyle());
        type = devil.getType();
        System.out.println(type + "的外观：");
        System.out.println("性别：" + devil.getSex());
        System.out.println("面容：" + devil.getFace());
        System.out.println("服装：" + devil.getCostume());
        System.out.println("发型：" + devil.getHairstyle());
    }
}
