import java.util.Calendar;

public class CalendarTest{
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        c.set(2004,1,7,15,40);
        long day1 = c.getTimeInMillis();
        day1 += 1000*60*60;
        c.setTimeInMillis(day1);
        System.out.println("new hour "+c.get(c.HOUR_OF_DAY));
    }
}