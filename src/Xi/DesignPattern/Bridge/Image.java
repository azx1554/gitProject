package Xi.DesignPattern.Bridge;

/**
 * Created by Xi on 2018/4/16.
 */
//抽象图像类：抽象类
public abstract class Image {
    protected OSInterface osInterface;

    public void setImageImp(OSInterface osInterface) {
        this.osInterface = osInterface;
    }

    public abstract void parseFile(String fileName);
}
