public class looper{
	public static void main(String []args){
		double i=1.0/0;
		while(i==i+1){
			System.out.println("Iteration_"+i);
            
		}
	}
}

/* Because the value i is infinity, the loops 
 * goes on infinitely. The number i could be any
 * large number becasue adding 1 to it would render the 
 * the actual stored value to be constant.
 * It is worth remembering that binary floating-point
 * arithmetic is only an approximation to real arithmetic.
 */