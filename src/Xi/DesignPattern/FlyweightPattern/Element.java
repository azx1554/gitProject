package Xi.DesignPattern.FlyweightPattern;

//享元接口
public abstract class Element {

    protected String symbol;

    Element() {}

    Element (String symbol) {
        this.symbol = symbol;
    }

    public abstract String getName();

    public void display() {
        System.out.println("当前元素为:" + this.getName());
    }
}
