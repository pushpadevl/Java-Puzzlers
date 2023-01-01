import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;

public class P61_Dating_Game{
    public static void main(String []args){
        //Calendar cal = new Calendar();
        Class calClass = Calendar.class.getClass();
        Method[] mets = calClass.getDeclaredMethods();
        Constructor[] cons = calClass.getConstructors();
       // System.out.println(cons.length);
//        for(Method m:mets) System.out.println(m.getName());
       // for(Constructor c:cons) System.out.println(c.getName());
        
       Calendar cal = Calendar.getInstance();
       cal.set(1999, 12, 31);
       System.out.println(cal.get(Calendar.YEAR) + " "+cal.get(Calendar.DATE));

       Date d = cal.getTime();
       System.out.println(d.getDay());
    }
}

/* 
public class DatingGame {
public static void main(String[] args) {
Calendar cal = Calendar.getInstance();
cal.set(1999, Calendar.DECEMBER, 31);
System.out.print(cal.get(Calendar.YEAR) + " ");
System.out.println(cal.get(Calendar.DAY_OF_MONTH));
}
}
/*
This puzzle only scratches the surface of the defects in Calendar and Date .
These APIs are minefields. Other serious problems with Calendar include weak
typing (nearly everything is an int), an overly complex state-space, poor struc-
ture, inconsistent naming, and inconsistent semantics. Be careful when using
Calendar or Date; always consult the API documentation.

*/