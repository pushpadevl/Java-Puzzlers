public class P84_SelfInerruption {
    public static void main(String[] args) {
        
        Thread.currentThread().interrupt();
        
        //if (Thread.interrupted()) {
            System.out.println("Interrupted: " +Thread.interrupted());
        //} else {
            System.out.println("Not interrupted: " +Thread.interrupted());
        //}
    }
}
/*  Calling Thread.interrupted always clears
the interrupted status of the current thread. 

use this if needed

(Thread.currentThread().isInterrupted() 

 Don’t use Thread.interrupted unless you
want to clear the interrupted status of the current thread. 

*/