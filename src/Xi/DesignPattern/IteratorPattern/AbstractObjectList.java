package Xi.DesignPattern.IteratorPattern;

import java.util.List;

/**
 * Created by Xi on 2018/4/18.
 */
public abstract class AbstractObjectList {
    protected List<Object> objectList;

    public AbstractObjectList(List<Object> objectList) {
        this.objectList = objectList;
    }

    public List getObjects() {
        return objectList;
    }

    public void addObject(Object o) {
        objectList.add(o);
    }

    public boolean remove(Object o) {
        return objectList.remove(o);
    }

    public abstract AbstractIterator createIterator();
}
