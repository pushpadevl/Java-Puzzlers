public class Type1{
        public static void main(String []args){
                String s=null;
                System.out.println(s instanceof String);
        }
}
/*Although null is a subtype of every reference
type, the instanceof operator is defined to return false when its left operand
is null
*/