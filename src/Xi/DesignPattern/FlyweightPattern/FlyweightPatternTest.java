package Xi.DesignPattern.FlyweightPattern;

public class FlyweightPatternTest {

    public static void main(String[] args) {
        ElementFactory factory = ElementFactory.getfactory();
        String key = "CO", name;
        int number1, number2;
        Element element = factory.getelement(key);
        number1 = 1;
        number2 = 2;
        name = "二氧化碳̼";
        Compound compound = new Compound(element, name, number1, number2);
        element.printMess(key, number1, number2);
        number1 = 1;
        number2 = 1;
        name = "一氧化碳̼";
        compound = new Compound(element, key, number1, number2);
        element.printMess(key, number1, number2);
        key = "HO";
        element = factory.getelement(key);
        number1 = 2;
        number2 = 1;
        name = "水";
        compound = new Compound(element, name, number1, number2);
        element.printMess(name, number1, number2);
        number1 = 2;
        number2 = 2;
        name = "过氧化氢";
        compound = new Compound(element, name, number1, number2);
        element.printMess(name, number1, number2);
    }

}
