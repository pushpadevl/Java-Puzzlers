public class escapeRout{
	public static void main(String [] arg){
	System.out.print("a\u0022.length() + \u0022b".length());
	/*
	* prints '2' becoz java compiler transaltes all unicode characters to the characters they represent
	* before parsing.
	* The /u0022 represents "" or double quotes, and so the program transaltes to
	* "a".length()+"b".length()
	*/
	
	}



} 
