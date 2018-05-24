package Xi.DesignPattern.FlyweightPattern;

public class FlyweightPatternTest {

    public static void main(String[] args) {
        ElementFactory factory = ElementFactory.getfactory();
        String key = "OH";
        Element element = factory.getelement(key);
        element.display();
        Element elementO = factory.getelement("O");
        Element elementH = factory.getelement("H");
        elementO.display();
        elementH.display();
    }

}
