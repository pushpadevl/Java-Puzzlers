public class P87_StrainedRelations {
    public static void main(String[] args) {
        
        double a = Double.NaN;
        double b = Double.NaN;
        double c = Double.NaN;

        System.out.println(a==a);
        System.out.println(a==b);

        System.out.println(a-b==b-a);

        long x = Long.MAX_VALUE;
double y = (double) Long.MAX_VALUE;
long z = Long.MAX_VALUE - 1;

System.out.print ((x == y) + " "); // Imprecise!
System.out.print ((y == z) + " "); // Imprecise!
System.out.println(x == z);
 // Precise

    }
}
