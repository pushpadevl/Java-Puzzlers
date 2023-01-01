/*import java.io.*;
import java.util.*;
public class Exceptionally_Unsafe{
    public static void main(String arg[]){
        int i=0;
        while(i<=Integer.MAX_VALUE){
            if(i==5){
                sneakyThrow();
            }else{
                System.out.println(" "+i+" lp;");
                i++;
                continue;
            }
        }
    }
    public static void sneakyThrow(){
        try{
        Thread.currentThread().sleep(2);
        }
        catch (Exception e){

        }
    
    }
}*/
/* Not the correct method...
 * We have to bypass Exception
 * checking, while this method only
 */

// Don’t do this either - circumvents exception checking!
public class Exceptionally_Unsafe {
    private static Throwable t;
    private Exceptionally_Unsafe() throws Throwable {
        throw t;
}
    public static synchronized void sneakyThrow(Throwable t) {
        Exceptionally_Unsafe.t = t;
        try {
            Exceptionally_Unsafe.class.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalArgumentException();
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException();
        } finally {
            Exceptionally_Unsafe.t = null; // Avoid memory leak
        }
    }
}