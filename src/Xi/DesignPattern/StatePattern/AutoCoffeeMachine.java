package Xi.DesignPattern.StatePattern;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AutoCoffeeMachine extends JFrame {
    State state;
    State haveCoffeeNoCoin, haveCoffeeAndCoin, haveNoCoffee;
    JButton putInCoin, getCaffee;
    JLabel messShowing;
    int caffeeCount;

    public AutoCoffeeMachine(int caffeecount) {
        caffeeCount = caffeecount;
        haveCoffeeAndCoin = new HaveCoffeeAndCoin(this);
        haveCoffeeNoCoin = new HaveCoffeeNoCoin(this);
        haveNoCoffee = new HaveNoCoffee(this);
        state = haveCoffeeNoCoin;
        putInCoin = new JButton("投币");
        getCaffee = new JButton("取咖啡");

        putInCoin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (state == haveCoffeeNoCoin) {
                    state = haveCoffeeAndCoin;
                    messShowing.setText("您投币一元");
                    messShowing.setIcon(new ImageIcon("C:/Users/xihaotian/Desktop/machine.jpg"));
                } else if (state == haveCoffeeAndCoin) {
                    messShowing.setText("您已投币，请取咖啡");
                    messShowing.setIcon(new ImageIcon("C:/Users/xihaotian/Desktop/machine.jpg"));//
                } else if (state == haveNoCoffee) {
                    messShowing.setText("没有咖啡，无法投币");
                    messShowing.setIcon(new ImageIcon("C:/Users/xihaotian/Desktop/no.jpg"));
                }
            }
        });

        getCaffee = new JButton("取咖啡");
        getCaffee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                giveAnCupCaffee();

            }
        });

        messShowing = new JLabel();
        messShowing.setIcon(null);//
        messShowing.setFont(new Font("", Font.BOLD, 20));
        JPanel pSouth = new JPanel();
        pSouth.add(putInCoin);
        pSouth.add(getCaffee);
        add(messShowing, BorderLayout.CENTER);
        add(pSouth, BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public void giveAnCupCaffee() {
        state.giveAnCupCaffee();
    }

    public void showMessage() {
        state.showMessage();
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCaffeeCount() {
        return caffeeCount;
    }

    public void setCoffeeCount(int count) {
        caffeeCount = count;
    }

    public State gethavecoffeenocoin() {
        return haveCoffeeNoCoin;
    }

    public State gethavecoffeeandcoin() {
        return haveCoffeeAndCoin;
    }

    public State gethavenocoffee() {
        return haveNoCoffee;
    }
}
