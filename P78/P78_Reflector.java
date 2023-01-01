import java.util.*;
import java.lang.reflect.*;

public class P78_Reflector{
    public static void main(String[] args) throws Exception{
        Set<String> s = new HashSet<String>();
        
        s.add("foo");
        Iterator it = s.iterator();
        Method m = it.getClass().getMethod("hasNext");
        System.out.println(m.invoke(it));

        //int[] arr = {1,2,3,4,5,0}; throws error
        Integer[] arr = {1,2,3,4,5,0}; // this doesn't
        
        List<Integer> list = Arrays.asList(arr);
        Iterator ita = list.iterator();
        System.out.println(list);
        System.out.println(ita.next());
    }
}
/* 
The problem isn’t the access level of the method; it’s the access level of the
type from which the method is selected. This type plays the same role as the qual-
ifying type in an ordinary method invocation [JLS 13.1]. In this program, the
method is selected from the class represented by the Class object that is returned
by it.getClass. This is the dynamic type of the iterator, which happens to be the
private nested class java.util.HashMap.KeyIterator . The reason for the
IllegalAccessException is that this class is not public and comes from another
package: You cannot legally access a member of a nonpublic type from
another package 
*/