import java.util.Calendar;

public class CalendarTest{
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        c.set(2004,1,7,15,40); // 更改时间为2004年1月7日
        long day1 = c.getTimeInMillis();
        day1 += 1000*60*60;
        c.setTimeInMillis(day1); // 加上一个小时
        System.out.println("new hour "+c.get(c.HOUR_OF_DAY)); 
        c.add(c.DATE, 35); // 加上35天
        System.out.println("add 35 days    " + c.getTime());
        c.roll(c.DATE, 35); // 滚动35天，只有日期字段动，月份不会动
        System.out.println("roll 35 days  " + c.getTime());
        c.set(c.DATE, 1); // 直接设定DATE的值
        System.out.println("set to 1 " + c.getTime());
    }
}