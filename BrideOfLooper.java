public class BrideOfLooper{
    public static void main(String [] args){
        //double i=0/0.0;
        double i=Double.NaN;
        while(i!=i){
            System.out.println("Printing");
        }
    }
}
/* NaN are values that are Not a Number.
 * Numbers such as 0/0.0, in this example,
 * atleast one of the poerands has to be
 * a  NaN. 
 */ 