package Xi.UseageOfJDK;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Xi on 2018/3/30.
 */

/**
 * 使用Calendar的注意事项
 * 1,calendar.set(Calendar.MONTH, 0)设置当前月份为1月
 * 2,Calendar.getInstance()获取的是当年的年月日，如果当前时间是3月30号，再调用
 * calendar.set(Calendar.MONTH, 2)，由于2月没有30号，calendar将自动转化成3月2号
 */
public class JDKCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2018);
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        calendar.add(Calendar.MONTH, -1);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        calendar.add(Calendar.MONTH, -1);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        calendar.add(Calendar.MONTH, -1);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
    }
}
