import java.util.*;

public class P60C {
    public static void main(String []args){
        Object[][] arr = new Object[3][3];

        //ht.add(9,"aaaaa", 'b');
        arr[0][0] = 9;
        arr[0][1] = "aaa";
        arr[0][2] = 'a';
        arr[1][0] = 'l';
        
        for(int i=0;i<3;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]+" "+arr[i][2]);    
        }

        ArrayList<ArrayList<Object>> ar2 = new ArrayList<>();
        ArrayList<Object> ob1 = new ArrayList<>();
        ob1.add(1); ob1.add("ss"); ob1.add('l');
        ArrayList<Object> ob2 = new ArrayList<>();
        ob2.add('a'); ob2.add(12);
            
        ar2.add(ob1);
        ar2.add(ob2);

        for(ArrayList<Object> k:ar2){
            for(Object kk:k){
                System.out.print(kk+" ");
            }
            System.out.println();
        }
        
    }
}
