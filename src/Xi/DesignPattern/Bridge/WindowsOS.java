package Xi.DesignPattern.Bridge;

/**
 * Created by Xi on 2018/4/16.
 */
//Windows操作系统实现类：具体实现类
public class WindowsOS implements OSInterface {
    public void doPaint(Matrix m) {
        //调用Windows系统的绘制函数绘制像素矩阵
        System.out.print("在Windows操作系统中显示图像：");
    }
}
