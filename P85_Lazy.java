public class P85_Lazy {
    private static boolean initialized = false;

    static {
        Thread t = new Thread(new Runnable(){
            public void run(){
                System.out.println("Starting run"+" threadname = "+Thread.currentThread().toString());
                initialized = true;
                System.out.println("run-- " +initialized +" threadname = "+Thread.currentThread().toString());
            }
        });
        t.start();
        try{
            //System.out.println("Joining "+initialized+" threadname = "+Thread.currentThread().toString());

            t.join();
        }catch (InterruptedException e){
            throw new AssertionError(e);
        }
    }

    public static void main(String[] args){
        System.out.println(initialized);
    }
}
/* 
1. Accessign initialized variable prompts class initialization
2. Deadlock

*/