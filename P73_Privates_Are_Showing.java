import java.io.Serializable;
import java.util.*;
import java.lang.reflect.*;
public class P73_Privates_Are_Showing {
    public static void main(String[] args){
        List<P73_Library> arr = new ArrayList<>(3);
        
        for(int i=0;i<3;i++){
            arr.add(new P73_Library());
            //System.out.println(arr.get(i).field1);
        }
        Field[] ar2 = arr.get(0).getClass().getFields();
        Method[] ar3 = arr.get(0).getClass().getMethods();
        System.out.println(Arrays.asList(ar3));
            
    }
}
final class P73_Library implements Serializable{
    private int field1 = 20;
    private String field2 = "abcd";
    private int method1(int a){
        return a*2;
    }
}
class P73_Client {
    
}