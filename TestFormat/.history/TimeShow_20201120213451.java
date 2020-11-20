import java.sql.Date;

public class TimeShow {
    public static void main(String[] args){
        Date d = new Date();
        System.out.println(String.format("%tc",d));
    }
}
