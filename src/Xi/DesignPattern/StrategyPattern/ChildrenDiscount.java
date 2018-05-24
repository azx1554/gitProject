package Xi.DesignPattern.StrategyPattern;

/**
 * Created by Xi on 2018/5/24.
 */

//儿童票折扣类：具体策略类
public class ChildrenDiscount implements Discount {

    public double calculate(double price) {
        System.out.println("儿童票：");
        return price - 10;
    }

}
