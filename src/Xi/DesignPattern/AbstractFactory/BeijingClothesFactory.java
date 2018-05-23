package Xi.DesignPattern.AbstractFactory;

public class BeijingClothesFactory extends ClothesFactory {

    @Override
    public UpperClothes creatupperclothes(int chestsize, int height) {
        return new WesternUpperclothes("��������������", chestsize, height);
    }

    @Override
    public Trousers creatTrousers(int waistsize, int height) {
        return new WesternTrousers("��������������", waistsize, height);
    }

}
