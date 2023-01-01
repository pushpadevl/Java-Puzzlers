public class GhostOfLooper{
	public static void main(String args []){
		
		byte i = -1;
		//short i= -1; //works
		//int i = -1; //doesn't work
		//long i =-1; //doesn't work
		while (i != 0){
			i >>>= 1;
			System.out.println("printing "+i);
		}
	
	}


}
/* The widening primitive conversion is the 
 * reason behind this behaviour
 */
