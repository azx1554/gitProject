package Xi.Concurrent.PrintABC.SolutionTwo;

/**
 * Created by Xi on 2018/4/13.
 */
public class LetterPrinter {
    private char letter = 'A';

    public void nextLetter() {
        switch (letter) {
            case 'A' : letter = 'B'; break;
            case 'B' : letter = 'C'; break;
            case 'C' : letter = 'A'; break;
            default: break;
        }
    }

    public void print() {
        System.out.print(letter);
    }

    public char getLetter() {
        return letter;
    }
}
