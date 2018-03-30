package Xi.DesignPattern;

/**
 * Created by X1 on 2018/3/26.
 */
public class Moon {
    private static Moon ourInstance = new Moon();

    public static Moon getInstance() {
        return ourInstance;
    }

    private Moon() {
    }
}
