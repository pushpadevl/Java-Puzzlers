public class P_24{
    public static void main(String[] args){
        for(byte b = Byte.MIN_VALUE; b<Byte.MAX_VALUE;b++){
            if(b==(byte)0x90){
                System.out.print(b+"joy");
            }
        }
    }
}
/* The problem in compiling the b==0x90 was 
 * that BYTE is a signed type value, which means
 * that 90 in hexa would be 1001 0000, which gives 
 * -112, which is -128+16.
 * Again, when we check for 0x80, the program compiles,
 * but doesn't print anything. It is because the RHS in
 * Byte b=0x80 is still a hexa, so it needs to explicitly
 * typecasted to BYTE type before compoarison.
 */ 