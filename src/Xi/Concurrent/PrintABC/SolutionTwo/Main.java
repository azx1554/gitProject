package Xi.Concurrent.PrintABC.SolutionTwo;

/**
 * Created by Xi on 2018/4/13.
 */

/**
 * 使用synchronized + wait + notify实现
 */
public class Main {
    public static void main(String[] args) {
        LetterPrinter letterPrinter = new LetterPrinter();
        Thread A = new Thread(new PrintRunnable(letterPrinter, 'A'));
        Thread B = new Thread(new PrintRunnable(letterPrinter, 'B'));
        Thread C = new Thread(new PrintRunnable(letterPrinter, 'C'));
        A.start();
        B.start();
        C.start();
    }
}
