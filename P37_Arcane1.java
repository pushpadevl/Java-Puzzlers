import java.io.IOException;
public class P37_Arcane1 {
    public static void main(String[] args) {
        try {
            System.out.println("Hello world");
       // } catch (IOException e) {                       // Fails because IOException cannot be thrown by System.out.print
        } catch (Exception e) {
            System.out.println("I’ve never seen println fail!");
        }
    }
} 
class P37_Arcane2 {
    public static void main(String[] args) {
        try {
        // If you have nothing nice to say, say nothing
           //  catch clauses that catch Exception or Throwable are legal regardless of the contents of the corresponding try clause.
        } catch (Exception e) {
            System.out.println("This can’t happen");
        }
        }
    }

interface Type1 {
    void f() throws CloneNotSupportedException;
}
interface Type2 {
    void f() throws InterruptedException;
}
interface Type3 extends Type1, Type2 {
    }
class P37_Arcane3 implements Type3 {
    public void f() {          
        // The set of checked exceptions that a method can throw is the intersection of
        // the sets of checked exceptions that it is declared to throw in all applicable
        // types, not the union
        System.out.println("Hello world");
    }
    public static void main(String[] args) {
        Type3 t3 = new P37_Arcane3();
        t3.f();
    }
}
    
/* The program neither has anything to throw CLONENOTSUPPEXC or
 * INTERREXCEP but it still compiles when interface TYPE3 is run
 * becsue 
 ***************************************************************
 * The set of checked exceptions that a method can throw is the intersection of
 * the sets of checked exceptions that it is declared to throw in all applicable
 * types, NOT THE UNION.
****************************************************************
 * Means if the intersection of CLONENTSUPPEXC and INTEREXCEP
 * is not thrown so the program compiles. But if we extend type3 by just one of those
 * interfaces then the program throws a checked exception
 * The third program illustrates the interaction of multiple 
 * inherited throws clauses, which reduces rather than increases
 * the number of exceptions that a method is permitted to throw. 
*/