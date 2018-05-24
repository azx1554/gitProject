package Xi.DesignPattern.CompositePattern;

/**
 * Created by Xi on 2018/5/24.
 */
public class VideoFile extends AbstractFile{
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("对视频文件" + name + "进行杀毒");

    }


}