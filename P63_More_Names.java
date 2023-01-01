import java.util.*;

public class P63_More_Names{
    private Map<String, String> m = new HashMap<String, String>();

    //public P63_More_Names(){ // this is a constructor
    public void P63_More_Names(){ // this is not, it is a method declaration not a constructor
        m.put("Mickey","Mouse");
        m.put("Mickey","Mantle");
    }
    public int size(){
        return m.size();
    }
    public static void main(String args[]){
        P63_More_Names moreNames = new P63_More_Names();
        System.out.println(moreNames.size());
        System.out.println(moreNames.size());
    }
}
/*
 Unfortunately, the presence of a
return type (void) turned the intended constructor declaration into a method dec-
laration, and the method never gets invoked.
*/