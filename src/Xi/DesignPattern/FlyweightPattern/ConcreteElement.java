package Xi.DesignPattern.FlyweightPattern;

/**
 * Created by Xi on 2018/5/23.
 */
public class ConcreteElement extends Element {

    ConcreteElement(String symbol) {
        super(symbol);
    }

    @Override
    public String getName() {
        return this.symbol + "元素";
    }
}
