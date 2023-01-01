public class P68_Shades_Of_Gray{
    public static void main(String[] args){
        System.out.println(X.Y.Z);
    }
}
class X{
    static C Y = new C();
    static class Y{
        static String Z="Black";
    }
    
}
class C{
    String Z = "white";
}

/* 
In summary, obey the standard naming conventions to avoid conflicts between
different namespaces (and because your program will be illegible if you violate
these conventions). Also, avoid variable names that conflict with common top-
level package names, and use MixedCase for class names even if they are acro-
nyms. By following these rules, you’ll ensure that your programs never obscure
class or package names. Yet again, this is a case of the general rule that you should
avoid name reuse except for overriding. For language designers, consider elimi-
nating the possibility of obscuring. C# does this by putting fields and nested
classes into the same name space.
*/
/* SOLUTION
public class ShadesOfGray {
public static void main(String[] args){
System.out.println(Ex.Why.z);
}
}
class Ex {
static class Why {
static String z = "Black";
}
static See y = new See();
}
class See {
String z = "White";
}
*/