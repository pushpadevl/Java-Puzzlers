public class CurseOfLooper{
    public static void main(String []arg){
        
        Integer i =new Integer(1);
        Integer j =new Integer(1);
        
        while(i<=j && j<=i && i!=j){
            System.out.println("Iterating");
        }
    }
}