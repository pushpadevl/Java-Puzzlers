public class associativity{
	public static void main(String[] arg){
		int j=0, k=0;
		int i = j>=k?j++:++k;
		System.out.println(i+"\t"+k+"\t"+j);
	}
}
/* the ?: operator's associativity is from right to left
 * 
*/
