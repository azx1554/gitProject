package Xi.DesignPattern.Adapter;

public class Computer {

    private ThreeHoles threeHoles;

    Computer(ThreeHoles threeHoles){
        this.threeHoles = threeHoles;
    }

    public void Charge(){
        threeHoles.poweredByThree();
        System.out.println("Computer is charging!");
    }
}
