public class P36_Indecision{
	public static void main(String [] args){
	System.out.println(decision());
	}
	static boolean decision(){
	try{
		System.out.println("aaaa");
		return true;
		//System.out.println("aaaa");
	} finally {
			System.out.println("ava");
			return false;
			//System.out.println("alpha");
		}
	}
}
/* The program prints false, which means the finally block
 * is always executed when control leaves the try block.
 * In summary, every finally block should complete normally, barring an
 * unchecked exception. Never exit a finally block with a return , break,
 * continue , or throw , and never allow a checked exception to propagate  * out of a finally block.
*/
