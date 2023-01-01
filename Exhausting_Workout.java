public class Exhausting_Workout {
public static void main(String[] args) {
workHard();
System.out.println("It’s nap time.");
}
private static void workHard() {
try {
    System.out.print("a ");
workHard();
} finally {
    System.out.print("1 ");
workHard();
}
}
}
/*  The workHard method calls itself recursively until the program throws a StackOverflowError, at which point it terminates with an uncaught exception
 * The Java virtual machine limits the stack depth to some preset level. When this level is exceeded, the VM throws a StackOverflowError.
 * This error is caught in the innermost finally block, where the stack depth is already 3. From there the workHard method attempts to call itself recursively, but the call fails with a StackOverflowError.
 * This error is caught in the finally block one level up, where the stack depth is 2. 
 * The call from this finally block has the same behavior as the call from the corresponding try block: It results eventually in a StackOverflowError.
 * A pattern appears to be emerging, and indeed it is.
 * A quick experiment shows that many VMs limit stack depth
to 1,024. The number of calls is therefore 1 + 2 + 4 + 8 … + 21,024 = 21,025  1. The
number of exceptions thrown is 21,024. Let’s assume that our machine can execute
1010 calls per second and generate 1010 exceptions per second, which is quite generous by current standards. Under these assumptions, the program will terminate
in about 1.7 × 10291 years. To put this in perspective, the lifetime of our sun is estimated at 1010 years, so it is a safe bet that none of us will be around to see this program terminate. Although it isn’t an infinite loop, it might as well be.
Technically speaking, the call diagram is a complete binary tree whose depth
is the stack depth limit of the VM. The execution of the Workout program
amounts to a preorder traversal of this tree. In a preorder traversal, the program
visits a node and then recursively visits its left and right subtrees. One call is made
for each edge in the tree, and one exception is thrown for each leaf node.
*/