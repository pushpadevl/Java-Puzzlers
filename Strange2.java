public class Strange2{
    public static void main(String []arg){
        Missing m;
        try{
            m=new Missing();
        }catch(java.lang.NoClassDefFoundError ex){
            System.out.println("Got 2.");
        }
    }
}
/* AT the problem this one should thorw the 
 * Exception and not catch it becasue it is outside the periphery
 * of the try catch block. But here, it does not throw any exception.
 */