import java.util.Random;

public class P75_CoinSide{
    private static Random rnd = new Random();

    public static P75_CoinSide flip(){
        return rnd.nextBoolean() ? P75_Heads.INSTANCE : P75_Tails.INSTANCE;

    }
    public static void main(String []args){
        System.out.println(flip());
    }
}
class P75_Heads extends P75_CoinSide{
    private P75_Heads(){}

    public static final P75_Heads INSTANCE = new P75_Heads();

    public String toString() {
        return "heads";
    }
}
class P75_Tails extends P75_CoinSide{
    private P75_Tails(){}

    public static final P75_Tails INSTANCE = new P75_Tails();

    public String toString() {
        return "tails";
    }
}
// source 1.4 