package Xi.DesignPattern.Adapter;

public class AdapterTest {

    //在只有两孔插座的情况下给三孔电脑充电
    public static void main(String[] args) {
        TwoHoles twoHoles = new TwoHoles();
        ThreeHoles threeHoles = new TwoHolesToThreeHolesAdapter(twoHoles);
        Computer computer = new Computer(threeHoles);
        computer.Charge();
    }
}
