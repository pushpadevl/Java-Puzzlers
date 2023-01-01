import java.util.*;

public class Name58{
    private final String first, last;

    public Name58(String first, String last){
        this.first = first;
        this.last = last;
    }
    @Override
    public boolean equals(Name58 n/*Object o*/){ // the error, Object is req not Name58.
        // with Name58 it is overloading, but we have to override
        //Name58 n = (Name58)o; // for explicit typecasting
        return n.first.equals(first) && n.last.equals(last);
    }
    @Override
    public int hashCode(){
        return 31*first.hashCode() +last.hashCode();
    }
    public static void main(String arg[]){
        Set<Name58> s = new HashSet<>();
        Name58 sns = new Name58("Don","aaa"); 
        s.add(sns);
        Name58 ss = new Name58("Don","aaa");         
        System.out.println(s.contains(ss));
    }
}
/* The HashSet class uses the equals(Object) method to test elements for
equality; it is of no consequence to HashSet that Name declares an equals(Name)
method. So where does Name get its equals(Object) method? It is inherited from
Object. This method returns true only if its argument and the object on which it
is invoked are one and the same

 in this puzzle, Name overrides the hashCode method but fails to override equals. 
 * That is not to say that Name doesn’t declare an equals method; it does, but it’s the wrong one.
 * The Name class declares an equals method whose argument is of type Name rather
than Object.
 * The author of this class probably intended to override the equals
 method but mistakenly overloaded it 
 */