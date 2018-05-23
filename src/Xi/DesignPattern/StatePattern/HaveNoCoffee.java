package Xi.DesignPattern.StatePattern;

import javax.swing.ImageIcon;

public class HaveNoCoffee extends State {
    AutoCoffeeMachine machine;

    public HaveNoCoffee(AutoCoffeeMachine machine) {
        this.machine = machine;
    }

    public void giveAnCupCaffee() {
        machine.messShowing.setIcon(new ImageIcon("C:/Users/xihaotian/Desktop/no.jpg"));
        machine.putInCoin.setEnabled(false);
        machine.getCaffee.setEnabled(false);
        showMessage();

    }


    public void showMessage() {
        machine.messShowing.setText("目前机器中没有咖啡");

    }

}
