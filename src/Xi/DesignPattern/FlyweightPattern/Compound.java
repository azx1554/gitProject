package Xi.DesignPattern.FlyweightPattern;

import java.util.HashMap;

public class Compound {
    private HashMap<Element, Integer> elementMap;
    private String name;

    Compound(HashMap elementMap, String name) {
        this.elementMap = elementMap;
    }

    public void display() {

    }
}
