package Xi.DesignPattern.AbstractFactory;

public class ShanghaiClothesFactory extends ClothesFactory{

	@Override
	public UpperClothes creatupperclothes(int chestsize, int height) {
		return new CowboyUpperclothes("�Ϻ���ţ������", chestsize, height);
	}

	@Override
	public Trousers creatTrousers(int waistsize, int height) {
		return new CowboyTrousers("�Ϻ���ţ�п���", waistsize, height);
	}

}
