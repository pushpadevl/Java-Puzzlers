import java.util.*;

public class Name{
    private final String first, last;
    
    public Name(String first, String last){
        this.first = first;
        this.last = last;
    }
    /* This method solves the problem, without this the error remains
     * The equals method should be complemented witht the HASHCODE method
     * otherwise, the equals functionality won't work. The EQUALS method 
     * uses HASHCODE to compare values
     */ 
    public int hashCode(){
        return 33*first.hashCode() + last.hashCode();
    }

    public boolean equals(Object o){
        if(!(o instanceof Name))
            return false;
        Name n = (Name)o;
        return n.first.equals(first) && n.last.equals(last);
    }
    public static void main(String args[]){
        Set<Name> s = new HashSet<>();
        Name ad = new Name("Mickey", "asa"); 
        s.add(ad);
        Name neww = new Name("Mickey", "asa");
        System.out.println(ad.hashCode()+"\n"+neww.hashCode());
        System.out.println(neww.first+" "+neww.last);
        System.out.println(s.contains(neww));
    }
}
/* The bug is that Name violates the hashCode contract.
 * This might seem strange, as Name doesn’t even have a hashCode method, but that is precisely the problem.
 * The Name class overrides the equals method, and the hashCode contract demands
that equal objects have equal hash codes.
 * To fulfill this contract, you must override hashCode whenever you override equals [EJ Item 8].
*/