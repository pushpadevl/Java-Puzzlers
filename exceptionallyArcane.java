import java.io.*;
import java.util.*;
/*public class exceptionallyArcane{
	public static void main(String []args){
		try {
			System.out.println("Hello world"); //STDOUT doesn't
			/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String n=br.readLine();*/ //BufferedReader compiles
		/*} catch(IOException e){
			System.out.println("I've never seen println fail!");
			}
	}*/

/*The try clause does I/O, and the catch clause catches IOException.
 * But the program does not compile because the println method isn’t
 * declared to throw any checked exceptions, and IOException is a
 * checked exception. The language specification says that it is a
 * compile-time error for a catch clause to catch a checked exception
 * type E if the corresponding try clause can’t throw an exception
 * of some subtype of E
*/
/*
	public static void main(String []args){
		try {
			
		} catch(Exception e){
			System.out.println("This can't happen");
			}
	}
	
*/

interface type1{
	void f() throws CloneNotSupportedException;
}
interface type2{
	void f() throws InterruptedException;
}
interface type3 extends  type2 , type1{}

public class exceptionallyArcane implements type3 {
	public void f(){
		System.out.println("Helo world");
	}
	public static void main(String[] args){
	 type3 t3 = new exceptionallyArcane();
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