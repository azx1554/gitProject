package Xi.DesignPattern.StrategyPattern;

/**
 * Created by Xi on 2018/5/24.
 */

//VIP会员票折扣类：具体策略类
public class VIPDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("VIP票：");
        System.out.println("增加积分！");
        return price * 0.5;
    }
}
