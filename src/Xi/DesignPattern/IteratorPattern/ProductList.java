package Xi.DesignPattern.IteratorPattern;

import java.util.List;

/**
 * Created by Xi on 2018/4/18.
 */
public class ProductList extends AbstractObjectList {


    public ProductList(List<Object> objectList) {
        super(objectList);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
