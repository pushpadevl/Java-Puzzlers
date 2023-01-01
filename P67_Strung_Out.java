public class P67_Strung_Out{
    public static void main(String[] args) { //but here
        //MString s = new MString("Hello t"); 
        String s = new String("Hello t");//there is no error here
        System.out.println(s);
    }
}
class String{
    private final java.lang.String s;
    
    public String(java.lang.String s){
        this.s = s;
    }

    public java.lang.String toString(){
        return s;
    }
}
/*
The VM can’t find the main method because it isn’t there. Although
StrungOut has a method named main, it has the wrong signature. A main method
must accept a single argument that is an array of strings [JVMS 5.2]. What the
VM is struggling to tell us is that StrungOut.main accepts an array of our String
class, which has nothing whatsoever to do with java.lang.String.

Broadly speaking, the lesson of this puzzle is to avoid the reuse of class
names, especially Java platform class names. Never reuse class names from the
package java.lang.

*/