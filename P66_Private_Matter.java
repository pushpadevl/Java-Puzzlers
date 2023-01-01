import jdk.javadoc.internal.doclets.formats.html.resources.standard;

class Base {
    public String className = "Base";
}
class Derived extends Base {
    private String className = "Derived"; //obb
}
    
public class P66_Private_Matter {
    public static void main(String[] args) {
        System.out.println(((Base)new Derived()).className);    
    }    
}
/*
 an overriding method must have an access modifier that
is no less restrictive than the method it overrides.
*/