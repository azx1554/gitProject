package Xi.DesignPattern.AbstractFactory;

public class Shop {
    UpperClothes cloth;
    Trousers trouser;

    public void giveSuit(ClothesFactory factory, int chestsize, int waistsize, int height) {
        cloth = factory.creatupperclothes(chestsize, height);
        trouser = factory.creatTrousers(waistsize, height);
        showMess();
    }

    ;

    private void showMess() {
        System.out.println("<��װ��Ϣ>");
        System.out.println(cloth.getname() + ":");
        System.out.println("��Χ:" + cloth.getchestsize());
        System.out.println("���:" + cloth.getHeight());
        System.out.println(trouser.getname() + ":");
        System.out.println("��Χ:" + trouser.getWaistsize());
        System.out.println("���:" + trouser.getHeight());
    }

}
