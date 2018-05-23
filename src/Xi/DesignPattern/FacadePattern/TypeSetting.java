package Xi.DesignPattern.FacadePattern;

//子系统
public class TypeSetting {
    String advertisement;

    public TypeSetting(String string) {
        advertisement = string;
    }

    public void typesetting() {
        System.out.println("广告排版格式");
        System.out.println("********");
        System.out.println(advertisement);
        System.out.println("********");
    }

}
