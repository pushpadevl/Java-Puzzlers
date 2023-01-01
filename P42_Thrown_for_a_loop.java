public class P42_Thrown_for_a_loop{
    public static void main(String[] args){
        int tests[][]={{6,5,4,3,2,1},{1,2},{1,2,3},{1,2,3,4},{1}};

        int successCount=112;

        try{
            int i=0;
            while(true){//this is an infinite loop
                if(thirdElementIsThree(tests[i++]))
                    successCount++;
                //if(i==tests.length)break;//adding this statement to stop looping
            }
        }catch (ArrayIndexOutOfBoundsException e){
            //e.printStackTrace();
        }
        System.out.println(successCount);
    }
    private static boolean thirdElementIsThree(int []a){
        return (a.length >= 3 && a[2]==3); //some arrays don;t have a[2] element
        //Plus the & in place of && was the second error
        /*if(a.length>=3){
            if(a[2]==3) return false;
            else return true;
        }else{
            return false;
        }*/
    }
}
/* There are two mistakes:
 * 1.  The first mistake is that the program uses the hideous loop idiom that depends on an array access throwing an exception. This idiom is not only unreadable but also extremely slow. Do not use exceptions for loop control; use exceptions only for exceptional conditions
 * 2. The & in place of &&