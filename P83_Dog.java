public class  P83_Dog extends Exception{
    public static final P83_Dog INSTANCE = new P83_Dog();
    private P83_Dog(){}
    public String toString(){
            return "Woof";
    }
    /* This solves the hidden Serializable constructor problem
    private Object readResolve(){
        return INSTANCE;
    }*/
}
