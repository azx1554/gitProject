package Xi.Concurrent;

public class ZeroEvenOdd {
    private int n;
    private int flag = 0;
    private int counter = 1;

    private Object obj = new Object();

    public ZeroEvenOdd(int n) {
        this.n = n;
    }
    
    public void zero() throws InterruptedException {
        if (n == 0) {
            System.out.println(0);
        } else {
            synchronized (obj) {
                while (counter <= n) {
                    if (flag == 0) {
                        System.out.print(0);
                        flag = 1;
                        obj.notifyAll();
                    } else {
                        obj.wait();
                    }
                }
            }
        }
    }

    public void even() throws InterruptedException {
        if (n > 0) {
            synchronized (obj) {
                while (counter <= n) {
                    if (flag == 1 && counter % 2 == 1) {
                        System.out.print(counter);
                        flag = 0;
                        counter++;
                        obj.notifyAll();
                    } else {
                        obj.wait();
                    }
                }
            }
        }
    }

    public void odd() throws InterruptedException {
        if (n > 0) {
            synchronized (obj) {
                while (counter <= n) {
                    if (flag == 1 && counter % 2 == 0) {
                        System.out.print(counter);
                        flag = 0;
                        counter++;
                        obj.notifyAll();
                    } else {
                        obj.wait();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ZeroEvenOdd test = new ZeroEvenOdd(5);
        new Thread(() -> {
            try {
                test.zero();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                test.even();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                test.odd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

}
