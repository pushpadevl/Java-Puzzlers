public class dupeOfURL{
	public static void main(String [] arg){
		System.out.print("iexplore:");
		http://www.google.com
		System.out.println(":maximize");

		outerloop:
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.println("Inner loop");
				break outerloop; //the label helps to break out of any loop possible
			}
			System.out.println("Outer loop");
		}
	}
}
/* The problem here is that there is no problem.
 * The program simply prints iexplore::maximize
 * The URL in the code is read as a label(http:)
 * and the comment with //www.google.com
 * The colon after http is very important for java
 * to read it as a label.
*/
