package Xi.DesignPattern.StrategyPattern;

import java.io.File;

/**
 * 在软件开发中，我们也常常会遇到类似的情况，实现某一个功能有多条途径，每一条途径对应一种算法，此时我们可以使用一种设计模式来实现灵活地选择解决途径，也能够方便地增加新的解决途径。
 *
 *  在策略模式中，我们可以定义一些独立的类来封装不同的算法，每一个类封装一种具体的算法，在这里，每一个封装算法的类我们都可以称之为一种策略(Strategy), 策略模式的主要目的是将算法的定义与使用分开，也就是将算法的行为和环境分开
 *
 *  策略模式：定义一系列算法类，将每一个算法封装起来，并让它们可以相互替换，策略模式让算法独立于使用它的客户而变化，也称为政策模式(Policy)。策略模式是一种对象行为型模式。
 */
public class StrategyPatternTest {

    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        double originalPrice = 60.0;
        double currentPrice;

        mt.setPrice(originalPrice);
        System.out.println("原始价为：" + originalPrice);
        System.out.println("---------------------------------");

        Discount discount;
        discount = (Discount)XMLUtil.getBean(); //读取配置文件并反射生成具体折扣对象
        mt.setDiscount(discount); //注入折扣对象

        currentPrice = mt.getPrice();
        System.out.println("折后价为：" + currentPrice);
    }
}
