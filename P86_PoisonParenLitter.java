public class P86_PoisonParenLitter {
    public static void main(String[] args) {
        byte b = -(128);
        int b = -(2147483648);
        long j = -(9223372036854775808L);

        System.out.println(b);
    }
}
/* 
As for a lesson, this puzzle has none. It’s a corner case, pure and simple. But
you must admit, it’s amusing.
*/