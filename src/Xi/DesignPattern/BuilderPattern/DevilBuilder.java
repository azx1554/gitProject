package Xi.DesignPattern.BuilderPattern;

/**
 * Created by Xi on 2018/4/17.
 */
//恶魔角色建造器：具体建造者(ConcreteBuilder)
public class DevilBuilder extends ActorBuilder {

    @Override
    //覆盖钩子方法: 恶魔是光头
    public boolean isBareheaded() {
        return true;
    }

    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }
}
