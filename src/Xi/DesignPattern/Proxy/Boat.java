package Xi.DesignPattern.Proxy;

import java.util.Random;

public class Boat implements Moveable{

    @Override
    public void move() {
        try {
            System.out.println("轮船行驶中...");
            Thread.sleep(new Random().nextInt(1000) + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showType() {
        System.out.println("我是轮船");
    }
}
