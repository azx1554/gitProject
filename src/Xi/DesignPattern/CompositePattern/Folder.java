package Xi.DesignPattern.CompositePattern;

import java.util.ArrayList;

/**
 * Created by Xi on 2018/5/24.
 */
public class Folder extends AbstractFile {

    private ArrayList<AbstractFile> fileList = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        fileList.add(file);
    }

    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("对文件夹" + name + "进行杀毒");

        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
