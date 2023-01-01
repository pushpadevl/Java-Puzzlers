import java.lang.reflect.*;
public class P80_Outer {
    public static void main(String[] args) throws Exception {
        new P80_Outer().greetWorld();
    }
     
    private void greetWorld() throws Exception {
        System.out.println(P80_Inner.class.newInstance());
        //System.out.println(new P80_Inner()); //solution 1
    }
    /* Solution 3
    private void greetWorld() throws Exception {
        Constructor c = P80_Inner.class.getConstructor(P80_Outer.class);
        System.out.println(c.newInstance(P80_Outer.this));
    }*/
        
    public /*static*/ class P80_Inner { //soution 2. (Pref) static nested class
        public String toString() {
            return "Hello world";
        }
    }
}
        /* 
        The constructor of a non-static nested class is compiled such that it has as its
first parameter an additional implicit parameter representing the immediately
enclosing instance [JLS 13.1]. This parameter is passed implicitly when you
invoke the constructor from any point in the code where the compiler can find an
appropriate enclosing instance. But this applies only when you invoke the con-
structor normally: nonreflectively. When you invoke the constructor reflectively,
this implicit parameter must be passed explicitly, which is impossible with
Class.newInstance.
*/
/* The reflective model of Java programs is not the same as the language model.
Reflection operates at the level of the virtual machine, exposing many details of
the translation of Java programs into class files. Some of these details are man-
dated by the language specification, but others differ from implementation to
implementation. The mapping from Java programs into class files was straightfor-
ward in early versions of the language, but it became more complex with the addi-
tion of advanced language features that are not directly supported in the VM, such
as nested classes, covariant return types, generics, and enums.
Because of the complexity of the mapping from Java programs to class files,
avoid using reflection to instantiate inner classes. 
*/