package Xi.DesignPattern.CompositePattern;

/**
 * Created by Xi on 2018/5/24.
 */
public class TextFile extends AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("对文本文件" + name + "进行杀毒");
    }
}
