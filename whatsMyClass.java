import com.sun.tools.javac.Main;

public class whatsMyClass{
	public static void main(String [] arg){
		System.out.println(whatsMyClass.class.getName().replaceAll("\\.","/")+".class");
		
	}
}

/* The problem was that inside replaceAll("."), the dot doesn't match a 
* dot exactly but instead matches any character except \n. So the dot      * needs to be replaced by a \\. to be matched exactky with a dot.
*/
