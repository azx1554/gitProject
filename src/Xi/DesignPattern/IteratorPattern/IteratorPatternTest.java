package Xi.DesignPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xi on 2018/4/18.
 */

/**
 *  迭代器模式是一种使用频率非常高的设计模式，通过引入迭代器可以将数据的遍历功能从聚合对象中分离出来，聚合对象只负责存储数据，而遍历数据由迭代器来完成。
 *  由于很多编程语言的类库都已经实现了迭代器模式，因此在实际开发中，我们只需要直接使用Java、C#等语言已定义好的迭代器即可，迭代器已经成为我们操作聚合对象的基本工具之一。
 */

/**
 *  在以下情况下可以考虑使用迭代器模式：

 (1) 访问一个聚合对象的内容而无须暴露它的内部表示。将聚合对象的访问与内部数据的存储分离，使得访问聚合对象时无须了解其内部实现细节。

 (2) 需要为一个聚合对象提供多种遍历方式。

 (3) 为遍历不同的聚合结构提供一个统一的接口，在该接口的实现类中为不同的聚合结构提供不同的遍历方式，而客户端可以一致性地操作该接口。
 */
public class IteratorPatternTest {
    public static void main(String[] args) {
        List products = new ArrayList();
        products.add("A");
        products.add("B");
        products.add("C");
        AbstractObjectList productList = new ProductList(products);
        AbstractIterator productIterator = productList.createIterator();
        System.out.println("正向遍历：");
        while (!productIterator.isLast()) {
            System.out.print(productIterator.getNextItem() + "，");
            productIterator.next();
        }
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("逆向遍历：");
        while (!productIterator.isFirst()) {
            System.out.print(productIterator.getPreviousItem() + "，");
            productIterator.previous();
        }
    }
}
