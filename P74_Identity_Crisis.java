import java.lang.reflect.*;
import java.util.*;
public class P74_Identity_Crisis {
    public static void main(String[] args) {
        P74_Enigma e = new P74_Enigma();
        //Method[] mar = e.getClass().getMethods();
        //System.out.println((Arrays.asList(mar)));
        System.out.println(e.equals(e));
    }
    
    static class P74_Enigma{
        public boolean equals(P74_Enigma e){ //Overloading
            return false;
        }
    }
}
// The puzzle only prohibits overriding, but not overloading
