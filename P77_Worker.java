import java.util.*;

public class P77_Worker extends Thread{

    public static void main(String[] args) throws InterruptedException{
        
        final P77_Worker worker = new P77_Worker();
        worker.start();

        Timer t = new Timer(true); //Daemon thread
        t.schedule(new TimerTask(){
            public void run(){ 
                worker.keepWorking();
            }
        }, 500 );
        
    
        Thread.sleep(501); // this value cannot be less than t.schedule time (500)
        worker.quit();
    }
    private volatile boolean quittingTime = false; // what is volatile

    public void run(){
        System.out.println("Starting to work.");
        while(!quittingTime)  pretendToWork();
        System.out.println("Beer is good");
    }
    
    private void pretendToWork(){
        try{
            System.out.println("Pretending to work.");   
             Thread.sleep(300); //Sleeping on the job
        }catch (InterruptedException ex){  }
    }
    // It’s quitting time, wait for worker - Called by good boss
    synchronized void quit() throws InterruptedException{
        System.out.println("Going to quit.");
        quittingTime = true;
        join();
    }

    // Rescind quitting time - Called by evil boss
    synchronized void keepWorking() {
        System.out.println("Still working.");
        quittingTime = false;
    }

    
    
}