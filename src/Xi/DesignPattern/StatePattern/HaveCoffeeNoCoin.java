package Xi.DesignPattern.StatePattern;

import javax.swing.ImageIcon;

public class HaveCoffeeNoCoin extends State {
    AutoCoffeeMachine machine;

    public HaveCoffeeNoCoin(AutoCoffeeMachine machine) {
        this.machine = machine;
    }

    public void giveAnCupCaffee() {
        machine.messShowing.setIcon(new ImageIcon("C:/Users/xihaotian/Desktop/no.jpg"));
        showMessage();

    }

    @Override
    public void showMessage() {
        machine.messShowing.setText("请投入一枚一元硬币");

    }


}
