public class P39_HelloGoodbye{
    public static void main(String []args){
        try{
            System.out.println("Hello world");
            System.exit(0);
        } finally{
            /*Runtime.getRuntime().addShutdownHook(
                new Thread(){
                    public void run(){
                        System.out.println("Goodbye world!");
                    }
                }
            );*/
            System.out.println("Goodbye world!");
        }
    }
}
/* 
 The System.exit method halts the execution of
the current thread and all others dead in their tracks. The presence of a
finally clause does not give a thread special permission to continue executing.
*/