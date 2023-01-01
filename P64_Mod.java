public class P64_Mod{
    public static void main(String []args){
        final int MODULUS=3;
        int[] histogram = new int[MODULUS];

        int i = Integer.MIN_VALUE;
        //System.out.println(Math.abs(++i)); // Problem is -Integer.MIN_VALUE = Integer.MAX_VALUE+1 = Integer.MIN_VALUE
        do{
            histogram[Math.abs(i) % MODULUS]++;
        }while(i++ != Integer.MAX_VALUE);

        for(int j=0;j<MODULUS; j++)
            System.out.print(histogram[j]+" ");
    }
}