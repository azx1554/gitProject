package Xi.DesignPattern.Adapter;

public class TwoHolesToThreeHolesAdapter implements ThreeHoles {

    private TwoHoles twoHoles;

    TwoHolesToThreeHolesAdapter(TwoHoles twoHoles){
        this.twoHoles = twoHoles;
    }

    @Override
    public void poweredByThree() {
        System.out.println("通过适配器把两孔转换成三孔");
        twoHoles.poweredByTwo();
    }
}

