package Xi.DesignPattern.AbstractFactory;

public class CowboyUpperclothes extends UpperClothes {
    private int chestsize;
    private int height;
    private String name;

    public CowboyUpperclothes(String name, int chestsize, int height) {
        this.name = name;
        this.chestsize = chestsize;
        this.height = height;
    }

    @Override
    public int getchestsize() {
        return chestsize;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getname() {
        return name;
    }


}
