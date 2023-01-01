class Jeopardy{
    public static final String PRIZE = "$64.00";
    public static final String method1(){
        return "Jeopardy static final method "+PRIZE;
    }
    public final String method2(){
        return "Jeopardy instance final method "+PRIZE;
    }
    public static String method3(){
        return "Jeopardy static method "+PRIZE;
    }
}
public class P72_Double_Jeopardy extends Jeopardy{
    public static final String PRIZE = "2 cents";
    /*
    public static final String method1(){
        return "Double Jeopardy static final method "+PRIZE;
    }
    public final String method2(){
        return "Double Jeopardy instance final method "+PRIZE;
    }*/
    public static String method3(){
        return "Double Jeopardy static method "+PRIZE;
    }
    public static void main(String[] args) {
        System.out.println(PRIZE);
        //System.out.printf("%s\n%s\n%s\n",method1(), (new P72_Double_Jeopardy()).method2(), method3()); //no impl of method1 and 2 in Double Jeopardy class
        System.out.printf("%s\n%s\n%s\n",method1(), (new P72_Double_Jeopardy()).method2(), method3()); // after impl method1 and 2 in Double Jeopardy
    }
}
/*
    Final modifier means something completely different
on methods and fields.
    On a method, final means that the method may not be
overridden (for instance methods) or hidden (for static methods) [JLS 8.4.3.3].
    On a field, final means the field may not be assigned more than once [JLS 8.3.1.2].
The keyword is the same, but the behavior is unrelated.
*/