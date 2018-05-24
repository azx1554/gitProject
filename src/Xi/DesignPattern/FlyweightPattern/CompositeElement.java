package Xi.DesignPattern.FlyweightPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xi on 2018/5/24.
 */
public class CompositeElement extends Element {

    private List<Element> elementList = new ArrayList<>();

    CompositeElement(String symbol, List<Element> elementList) {
        this.symbol = symbol;
        this.elementList = elementList;
    }

    @Override
    public String getName() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Element e : elementList) {
            stringBuffer.append(e.getName()).append(",");
        }
        stringBuffer.deleteCharAt(stringBuffer.length()-1).append("的组合元素");
        return stringBuffer.toString();
    }
}
