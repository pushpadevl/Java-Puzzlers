import java.util.*;
public class P65_Suspicious_Sort {
    
    public static void main(String[] args){
        Random rnd = new Random();
        Integer[] arr = new Integer[100];

        //for(int i=0;i<arr.length; i++) arr[i] = rnd.nextInt(100);//Solution(1)
        for(int i=0;i<arr.length; i++) arr[i] = rnd.nextInt(); //this doesn't becoz i1-i2 may be out of range for integer(OVERFLOW condition), so the comparator needs to be altered
        

        Comparator<Integer> cmp = new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2){
                long d = (long)i2-(long)i1;
                if(d<Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
                else if(d>Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                else return (int)d;
            }
            /*public int compare(Integer i1, Integer i2){
                return i2>i1?1:(i2==i1?0:-1); //Solution(2) 
            }*/
        };
        for(int i:arr)System.out.print(i+" ");
        //Arrays.sort(arr,cmp); //this works with the modified comparator
        Arrays.sort(arr,Collections.reverseOrder()); //Solution(3)
        
        
        System.out.println("\n");
        for(int i:arr)System.out.print(i+" ");

        System.out.println(order(arr));
    }

    enum Order { ASC, DES, CON, UNO};

    static Order order(Integer[] a){
        boolean asc = false;
        boolean des = false;

        for(int i=1; i<a.length; i++){
            asc |= (a[i] > a[i-1]);
            des |= (a[i] < a[i-1]);
        }

        if(asc && !des) return Order.ASC;
        if(!asc && des) return Order.DES;
        if(!asc) return Order.CON;
        return Order.UNO;
        
    }
}