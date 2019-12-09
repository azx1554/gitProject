package Xi.DesignPattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

    private Moveable moveable;

    public TimeHandler(Moveable moveable){
        super();
        this.moveable = moveable;
    }

    /*
    *参数：
    *proxy 被代理对象
    *method 被代理对象的方法
    *args 方法的参数
    *
    * 返回值
    * Object 方法的返回值
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        new Thread(()->{
            String s = null;
            System.out.println(s.length());
        }).start();
        System.out.println("开始行驶...");
        method.invoke(moveable);
        long endTime = System.currentTimeMillis();
        System.out.println("结束行驶...");
        System.out.println("行驶时间:"+ (endTime-startTime) + "毫秒");
        return null;
    }
}
