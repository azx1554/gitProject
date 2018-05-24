package Xi.DesignPattern.FlyweightPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//享元工厂与具体享元
public class ElementFactory {
    private HashMap<String, Element> hashmap;
    static ElementFactory Factory = new ElementFactory();

    private ElementFactory() {
        hashmap = new HashMap<>();
    }

    public static ElementFactory getfactory() {
        return Factory;
    }

    public synchronized Element getelement(String key) {
        if (hashmap.containsKey(key))
            return hashmap.get(key);
        else {
            if (key.length() > 1) {
                List<Element> elements = new ArrayList<>();
                for (int i = 0; i < key.length(); i++) {
                    String tempKey = String.valueOf(key.charAt(i));
                    elements.add(getelement(tempKey));
                }
                Element element = new CompositeElement(key, elements);
                hashmap.put(key, element);
                return element;
            } else {
                Element element = new ConcreteElement(key);
                hashmap.put(key, element);
                return element;
            }
        }
    }
}
