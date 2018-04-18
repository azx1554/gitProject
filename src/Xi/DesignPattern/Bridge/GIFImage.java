package Xi.DesignPattern.Bridge;

/**
 * Created by Xi on 2018/4/16.
 */

//GIF格式图像：扩充抽象类
public class GIFImage extends Image {

    @Override
    public void parseFile(String fileName) {
        //模拟解析GIF文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        osInterface.doPaint(m);
        System.out.println(fileName + "，格式为GIF。");
    }
}
