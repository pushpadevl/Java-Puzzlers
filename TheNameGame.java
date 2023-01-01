import java.util.*;
public class TheNameGame {
public static void main(String args[]) {
Map<String, String> m =
new IdentityHashMap<String, String>();
m.put("Mickey", "Mouse");
m.put("Mickey", "Mantle");
System.out.println(m.size());
System.out.println(m);

}
}
