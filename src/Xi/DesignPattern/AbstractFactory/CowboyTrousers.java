package Xi.DesignPattern.AbstractFactory;

public class CowboyTrousers extends Trousers {

    private int waistsize;
    private int height;
    private String name;

    public CowboyTrousers(String name, int waistsize, int height) {
        this.name = name;
        this.waistsize = waistsize;
        this.height = height;
    }

    @Override
    public int getWaistsize() {
        return waistsize;
    }

    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return height;
    }

    @Override
    public String getname() {
        // TODO Auto-generated method stub
        return name;
    }
}
