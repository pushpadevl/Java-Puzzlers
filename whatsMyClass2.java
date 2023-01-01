import java.io.File;

public class whatsMyClass2{
	public static void main(String [] args){
		System.out.println(whatsMyClass2.class.getName().replaceAll("\\.", File.separator)+".class");
	htt:while(1>0){break;}
	}
}
/*
	The program displays one of two behaviors depending on the underlying platform.
If the file separator is a slash, as it is on UNIX, the program prints com/javapuzzlers/MeToo.class , which is correct. If, however, the file separator is a backslash, as it is on Windows, the program prints something else.
One is java.util.regex.Matcher.quoteReplacement ,
which translates a string into the corresponding replacement string. Here is how to fix the program by using this method
*/
//http: