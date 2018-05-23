package Xi.DesignPattern.FacadePattern;


public class FacadePatternTest {

    public static void main(String[] args) {
        ClientServerFacade A;
        String advertisement = "java设计模式，价格29元，联系电话15623785929";
        A = new ClientServerFacade(advertisement);
        A.doadvertisement();
    }
}
