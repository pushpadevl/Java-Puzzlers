public class P76_PingPong{
    public static synchronized void main(String []args) throws Exception{
        Thread t = new Thread(){
            public void run(){
                pong();
                /*try{
                   sleep(500);
                }catch(Exception e){
                    System.err.print(e);
                }*/
            }
        };
        //t.start(); //ping pong
        t.run(); //pong ping
        System.out.println("Ping");
    }

    static synchronized void pong(){
        System.out.println("Pong");
    }
}