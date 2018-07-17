package Xi.Concurrent.PrintABC.SolutionOne;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Xi on 2018/4/13.
 */

/**
 * 使用锁的方式实现
 */
public class Main {
    private static int state = 0;

    private final static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread A = new Thread(() -> {
            while (state < 15) {
                lock.lock();
                if (state % 3 == 0 && state < 15) {
                    System.out.print("A");
                    state++;
                }
                lock.unlock();
            }
        });
        Thread B = new Thread(() -> {
            while (state < 15) {
                lock.lock();
                if (state % 3 == 1 && state < 15) {
                    System.out.print("B");
                    state++;
                }
                lock.unlock();
            }
        });
        Thread C = new Thread(() -> {
            while (state < 15) {
                lock.lock();
                if (state % 3 == 2 && state < 15) {
                    System.out.print("C");
                    state++;
                }
                lock.unlock();
            }
        });
        A.start();
        B.start();
        C.start();
    }
}
