package Xi.Concurrent.PrintABC.SolutionTwo;

/**
 * Created by Xi on 2018/4/13.
 */
public class PrintRunnable implements Runnable {

    private LetterPrinter letterPrinter;
    private char letter;

    public PrintRunnable(LetterPrinter letterPrinter, char letter) {
        this.letterPrinter = letterPrinter;
        this.letter = letter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (letterPrinter) {
                if (letterPrinter.getLetter() != letter) {
                    try {
                        letterPrinter.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                letterPrinter.print();
                letterPrinter.nextLetter();
                letterPrinter.notifyAll();
            }
        }
    }
}
