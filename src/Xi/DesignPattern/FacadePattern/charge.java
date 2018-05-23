package Xi.DesignPattern.FacadePattern;

//子系统
public class charge {
    checkword word;
    int basiccharge = 12;

    charge(checkword word) {
        this.word = word;
    }

    public void givecharge() {
        double charge = word.getamount() * basiccharge;
        System.out.println("广告费用:" + charge + "元");
    }
}
