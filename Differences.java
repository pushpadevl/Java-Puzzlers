import java.util.*;

public class Differences {
    public static void main(String []args){
        int []vals ={ 789, 678, 567, 456,
        345, 234, 123, /*0b11 0B11*/ 0X22 /*0x22 0X22 012*/}; // the error was here, if 12 is 012 then the error pops up
            // 0 before a number means an OCTAL number so 
            // 022 is in octal so in decimal it is 18
            // 0x22 is hexadecimal so it is 34
        Set<Integer> diffs = new HashSet<>();
        for(int i=0; i< vals.length; i++){
            for(int j=i+1; j<vals.length; j++){
                int pp = vals[i]- vals[j];
                System.out.print(pp+" ");
                diffs.add(pp);
            }
            System.out.println();
        }
        System.out.println(diffs);
        System.out.println(diffs.size());
        
    }    
}
