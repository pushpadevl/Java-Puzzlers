import java.util.*;

public class TheDatingGame{
    public static void main(String args[]){
        Calendar cal = Calendar.getInstance();
        //System.out.println(cal);
        cal.set(2002, 11, 31);
        System.out.print(cal.get(Calendar.YEAR)+" ");

        Date d = cal.getTime();
        System.out.println(d);
        System.out.println(d.getDay());
    }
}