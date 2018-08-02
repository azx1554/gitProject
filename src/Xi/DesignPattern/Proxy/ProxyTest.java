package Xi.DesignPattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理类需要在运行时指定所代理真实主题类的接口，客户端在调用动态代理对象的方法时，调用请求会将请求自动转发给InvocationHandler对象的invoke()方法，由invoke()方法来实现对请求的统一处理。
 */
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
        proxyInstance.showType();
        System.out.println(proxyInstance.getClass());
    }
}
