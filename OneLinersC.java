import java.util.ArrayList;
import java.math.BigInteger;
import java.util.*;
public class OneLinersC{
    public static void main(String [] args){
        BigInteger a=new BigInteger("12");
        BigInteger b=new BigInteger("13");
        int c= a.bitCount();
        int d= b.bitCount();
        if(c>d) System.out.println(c+"true");
        else System.out.println(d+"false");
    }
}