package Xi.DesignPattern.StrategyPattern;

/**
 * Created by Xi on 2018/5/24.
 */
//折扣类：抽象策略类
public interface Discount {
    public double calculate(double price);
}
