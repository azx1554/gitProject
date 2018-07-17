package Xi.Concurrent.PrintABC.SolutionOne;

/**
 * Created by Xi on 2018/5/30.
 */
public class Main2 {

    private static Integer state = 0;

    public static void main(String[] args) {
        Thread A = new Thread(() -> {
            while (state < 15) {
                synchronized (state) {
                    if (state % 3 == 0 && state < 15) {
                        System.out.print("A");
                        state++;
                    }
                }
            }
        });

        Thread B = new Thread(() -> {
            while (state < 15) {
                synchronized (state) {
                    if (state % 3 == 1 && state < 15) {
                        System.out.print("B");
                        state++;
                    }
                }
            }
        });

        Thread C = new Thread(() -> {
            while (state < 15) {
                synchronized (state) {
                    if (state % 3 == 2 && state < 15) {
                        System.out.print("C");
                        state++;
                    }
                }
            }
        });

        A.start();
        B.start();
        C.start();
    }
}
