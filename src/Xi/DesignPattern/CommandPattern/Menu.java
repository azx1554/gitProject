package Xi.DesignPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xi on 2018/4/19.
 */
public class Menu {

    private List<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public boolean removeMenuItem(MenuItem menuItem) {
        return menuItems.remove(menuItem);
    }

    public void excuteAllMenuItems() {
        for (MenuItem menuItem : menuItems) {
            menuItem.click();
        }
    }

}
