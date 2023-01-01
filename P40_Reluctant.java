import java.io.*;
public class P40_Reluctant{
    private P40_Reluctant internalInstance = new P40_Reluctant();
    /* Withou this line, the stack overflow problem is 
     * not there.
     * And StackOVERFLOW is an error not an exception
     * Constuctors must declare any checked Exception,
     * thrown by its instance initializers
     * 
     */ 

    public P40_Reluctant() throws Exception{
        // When you invoke a constructor, the instance variable initializ-
        // ers run before the body of the constructor
        throw new Exception("No voy a salir.");
    }
    public static void main(String[] args){
        try{
            P40_Reluctant  b = new P40_Reluctant();
            System.out.println("Sorpreso!");
        }catch (Exception e){
            System.out.println("Te lo dije");
        }
    }
}