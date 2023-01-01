
import java.util.*;
public class Elvis {

private  final int beltSize;

private final int CURRENT_YEAR =// the CURRENT_YEAR varibale should not be static
Calendar.getInstance().get(Calendar.YEAR);
public static final Elvis INSTANCE = new Elvis();
private Elvis() {
beltSize = CURRENT_YEAR -1930;
}
public int beltSize() {
return beltSize;
}
public static void main(String[] args) {
System.out.println("Elvis wears a size " +
INSTANCE.beltSize() + " belt.");
}
}
//The static methods and variables are initialized first, and because the variable is a final type so it doesn't change its value.
/* To fix a class initialization cycle,
reorder the static field initializers so that each initializer appears before any
initializers that depend on it. In this program, the declaration for CURRENT_YEAR
belongs before the declaration for INSTANCE, because the creation of an Elvis*/

/* Reordering the INSTANCE declaration after the static final variables have been initialized also solves the problem.
*/
/* All STATIC METHODS AND VARIBLES SHOULD BE DECLARED BEFORE THE OTHER METHODS AND VARIBALE*/