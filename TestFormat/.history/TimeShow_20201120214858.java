import java.util.*;

public class TimeShow {
    public static void main(String[] args){
        System.out.println(String.format("%tc",new Date()));
        System.out.println(String.format("%tr",new Date()));
        Date today = new Date();
        System.out.println(String.format("%A, %B %td",today,today,today));
    }
}