package Xi.DesignPattern;

import java.util.Arrays;

/**
 * Created by X1 on 2018/3/26.
 */
public class Moon {

    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run without lambda");
            }
        };

        Runnable runnable2 = () -> {
            System.out.println("run with lambda");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        Arrays.asList("a", "b", "c").forEach( (String s) -> {
            System.out.println(s);
        });
    }

}
