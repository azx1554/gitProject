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

        Moveable proxyInstance = (Moveable) getProxy(car);
        proxyInstance.move();

        proxyInstance = (Moveable) getProxy(boat);
        proxyInstance.move();

    }

    public static Object getProxy(final Moveable target) {
        /*
        Object proxyInstance = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    //todo: 增加代理业务
                    method.invoke(target, args);
                    //todo: 增加代理业务
                    return null;
                }
        );
        */

        /*
         *loader 类加载器
         *interfaces 实现的接口
         *h InvocationHandler
         */
        Object proxyInstance = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TimeHandler(target));
        return proxyInstance;
    }
}
