package Xi.DesignPattern.AbstractFactory;

public abstract class ClothesFactory {
	public abstract UpperClothes creatupperclothes(int chestsize,int height);
	public abstract Trousers creatTrousers(int waistsize,int height);

}
