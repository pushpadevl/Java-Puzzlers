import java.util.*;

public class P62_Name_Game{
    public static void main (String []args){
        Map<String, String> m = new IdentityHashMap<String, String>();
        m.put("Mickey", "Mouse");
        m.put("Mickey","Mantle");
        System.out.println(m.size()+"\n"+m);
    }
}