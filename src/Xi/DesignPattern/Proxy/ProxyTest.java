package Xi.DesignPattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        InvocationHandler handler = new TimeHandler(car);
        Class cls = car.getClass();
        /*
         *loader 类加载器
         *interfaces 实现的接口
         *h InvocationHandler
         */
        Moveable proxyInstance = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),handler);
        proxyInstance.move();
        handler = new TimeHandler(boat);
        cls = boat.getClass();
        proxyInstance = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),handler);
        proxyInstance.move();
        System.out.println(proxyInstance.getClass());
    }
}
