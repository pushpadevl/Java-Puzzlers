public class Down_4_d_count{
    public static void main(String []args){
        final int START = 2000000000;
        int count=0;
        for(float f = START;f<START+63;f++){
        System.out.println(f+" ff"+START+" ");
        count++;
        }
        //System.out.println(count);
    }
}
/*ork. The initial value of f is close to Integer.MAX_VALUE,
so it requires 31 bits to express precisely, and the float type provides only 24 bits
of precision.

Here, because Float cannot accomodate more than 24 bits in integral side and int is 31 bits
so it discards the seven rightmost digits.
And so the threshold for this to behave as such is 63 which takes 7 bits to represent.
Any number more than that would result in a INFINTE LOOP
*/