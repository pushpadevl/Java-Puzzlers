public class P81_Greeter {
    public static void main (String[] args) {
        String greeting = "Hello world";
        //System.out.println(greeting+" a"); // with this un//, only this line gets printed
        for (int i = 0; i < greeting.length(); i++)
        System.out.write(greeting.charAt(i)); // prints when b does, not when a does
        //System.out.println(greeting+" b"); // with this un// it prints as usual
       // System.out.flush(); //Solution 1
    }
        
}

/* write method does not automatically flush,
 * so, on using line 'b'(println), it flushes
 * hence it works with 'b', but not 'a'
 * The problem is that System.out is buffered. The characters in Hello world
were written to the buffer for System.out, but the buffer was never flushed
*/