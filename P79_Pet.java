public class P79_Pet {
    public final String name, food, sound;

    public P79_Pet(String name, String food, String sound) {
        this.name = name;
        this.food = food;
        this.sound = sound;
    }
    
    public void eat() {
        System.out.println(name + ": Mmmmm, " + food);
    }
    public void play() {
        System.out.println(name + ": " + sound + " " + sound);
    }
    public void sleep() { // this might be the problem, sleep() as in Thread.sleep()
        // Sol 1. change name
        System.out.println(name + ": Zzzzzzz...");
    }
    public void live() {
        new Thread() {
            public void run() {
                while (true) {
                    eat();
                    play();
                    sleep(); 
                    //P79_Pet.this.sleep(); // Sol 2. use this
                }
            }
        }.start();
        /* Sol 3. Use runnable
        The third and arguably best way to fix the problem is to take the advice of
        Puzzle 77 and use the Thread(Runnable) constructor instead of extending Thread.
        If you do this, the problem goes away because the anonymous class does
        not inherit Thread.sleep.

        public void live() {
            new Thread(new Runnable() {
            public void run() {
            while (true) {
            eat();
            play();
            sleep();
            }
            }
            }).start();
            }
        */            
    }
    public static void main(String[] args) {
       new P79_Pet("Fido", "beef", "Woof").live();
    }
}
/* 
The sleep methods inherited into the anonymous class from Thread shadow
[JLS 6.3.1] the desired sleep method. As you saw in Puzzles 71 and 73, you
should avoid shadowing. The shadowing in this puzzle is indirect and uninten-
tional, which makes it even more insidious than usual
*/
