public class Null{
  public static void greet(){
    System.out.println("eeee");
  }
  public static void main(String []args){
    ((Null)null).greet();

  }
}
/*
. In this case, there is no object, but that makes no difference. A qualifying expression for a static method invocation is evaluated, but its value is
ignored. There is no requirement that the value be non-null
*/
