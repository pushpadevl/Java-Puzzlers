import static java.util.Arrays.toString;

public class P71_Import_Duty {
    public static void main(String[] args) {
        printArgs(1,2,3,4,5);
    }
    static void printArgs(Object... args){
        System.out.println(toString(args));
    }
}
/*
In this case, toString refers to the toString method
from Object. Simply put, members that are naturally in scope take prece-
dence over static imports. 
One consequence is that static methods with the same
name as Object methods cannot be used with the static import facility.

*/