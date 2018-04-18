package Xi.DesignPattern.BuilderPattern;

/**
 * Created by Xi on 2018/4/17.
 */

//角色建造器：抽象建造者(AbstractBuilder)
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    //钩子方法: 判断是不是光头
    public boolean isBareheaded() {
        return false;
    }

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    public Actor createActor() {
        return actor;
    }

}
