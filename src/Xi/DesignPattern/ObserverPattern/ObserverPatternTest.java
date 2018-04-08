package Xi.DesignPattern.ObserverPattern;

/**
 * Created by Xi on 2018/4/8.
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        WechatServer wechatServer = WechatServer.getInstance();
        User sf = new User("sf");
        User wr = new User("wr");
        wechatServer.registerObserver(sf);
        wechatServer.registerObserver(wr);
        wechatServer.setImformation("YYF公众号发生更新");
        wechatServer.removeObserver(sf);
        wechatServer.setImformation("BB姬公众号发生更新");
    }
}
