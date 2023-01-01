public class P13_AnimalFarm {
    public static void main(String[] args) {
        final String pig = "length: 10";
        final String pig2 = "length: 10";
        
        final String dog = "length: " + pig.length();
        System.out.println("Animals are equal: "
        + pig == dog);
        System.out.println("Animals are equal: "
        + (pig2 == pig));
        
        }
        
}
/* reason
 The + operator, whether used for addition or string concatenation,
binds more tightly than the == operator. Therefore, the parameter of the println
method is evaluated like this:

System.out.println(("Animals are equal: " + pig) == dog);
*/