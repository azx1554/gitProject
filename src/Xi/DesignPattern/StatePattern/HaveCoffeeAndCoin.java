package Xi.DesignPattern.StatePattern;

import javax.swing.ImageIcon;

public class HaveCoffeeAndCoin extends State {
    AutoCoffeeMachine machine;

    public HaveCoffeeAndCoin(AutoCoffeeMachine machine) {
        this.machine = machine;
    }

    public void giveAnCupCaffee() {
        int count = machine.getCaffeeCount();
        if (count == 0) {
            machine.setState(machine.gethavenocoffee());
            machine.messShowing.setText("NO CAFFEE!");
            machine.messShowing.setIcon(new ImageIcon("C:/Users/xihaotian/Desktop/no.jpg"));
        } else if (count == 1) {
            machine.messShowing.setIcon(new ImageIcon("C:/Users/xihaotian/Desktop/caffee.jpg"));
            machine.setCoffeeCount(count - 1);
            showMessage();
            machine.setState(machine.gethavenocoffee());
        } else {
            machine.messShowing.setIcon(new ImageIcon("C:/Users/xihaotian/Desktop/caffee.jpg"));
            machine.setCoffeeCount(count - 1);
            showMessage();
            machine.setState(machine.gethavecoffeenocoin());
        }


    }


    public void showMessage() {
        machine.messShowing.setText("您得到一杯咖啡");
    }

}
