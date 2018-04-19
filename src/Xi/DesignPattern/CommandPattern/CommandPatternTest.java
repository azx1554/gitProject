package Xi.DesignPattern.CommandPattern;

/**
 * Created by Xi on 2018/4/19.
 */


public class CommandPatternTest {

    public static void main(String[] args) {
        BoardScreen boardScreen = new BoardScreen();
        Menu menu = new Menu();
        MenuItem openMenuItem = new MenuItem();
        MenuItem editMenuItem = new MenuItem();
        Command openCommand = new OpenCommand(boardScreen);
        Command editCommand = new EditCommand(boardScreen);
        Command createCommand = new CreateCommand(boardScreen);
        openMenuItem.setCommand(openCommand);
        editMenuItem.setCommand(editCommand);
        menu.addMenuItem(openMenuItem);
        menu.addMenuItem(editMenuItem);
        menu.excuteAllMenuItems();

        CommandQueue commandQueue = new CommandQueue();
        commandQueue.addCommand(createCommand);
        commandQueue.addCommand(openCommand);
        MenuItemWithCommandQueue mc = new MenuItemWithCommandQueue(commandQueue);
        mc.call();
    }
}
