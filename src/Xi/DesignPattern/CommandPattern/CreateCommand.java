package Xi.DesignPattern.CommandPattern;

/**
 * Created by Xi on 2018/4/19.
 */

//具体命令类(ConcreteCommand)
public class CreateCommand implements Command {

    private BoardScreen boardScreen;

    public CreateCommand(BoardScreen boardScreen) {
        this.boardScreen = boardScreen;
    }

    @Override
    public void execute() {
        boardScreen.create();
    }
}
