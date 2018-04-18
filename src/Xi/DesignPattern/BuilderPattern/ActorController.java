package Xi.DesignPattern.BuilderPattern;

/**
 * Created by Xi on 2018/4/17.
 */


//游戏角色创建控制器：指挥者(Director)
public class ActorController {

    //逐步构建复杂产品对象
    public static Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        //通过钩子方法来控制产品的构建
        if (!ab.isBareheaded()) {
            ab.buildHairstyle();
        }
        actor = ab.createActor();
        return actor;
    }
}
