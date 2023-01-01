import java.util.*;
public class P88_Pair<T> {
    private final T first;
    private final T second;

    public P88_Pair(T first, T second){
        this.first = first;
        this.second = second;
    }
    /*
    //EXTRA
    public P88_Pair(T...arg){ //works
        this.first = arg[0];
        this.second = arg[1];
    }
    */
    public T first(){
        return first;
    }
    public T second(){
        return second;
    }
    /*
    public List<String> stringList(){ 
        return Arrays.asList(String.valueOf(first), String.valueOf(second));
    }*/
    //Sol 2
    public List<?> stringList(){ 
        return Arrays.asList(String.valueOf(first), String.valueOf(second));
    }
    

    public static void main(String[] args) {
        P88_Pair p = new P88_Pair<Object>(23,"skidoo");
        //P88_Pair<Object> p = new P88_Pair<Object>(23,"skidoo"); //Sol 1
        
        System.out.println(p.first() +" "+p.second());

        for(String s: p.stringList()) //this doesn't
            System.out.println(s+" ");
        
        //for(Object s: p.stringList()) //this works, //Sol. 3 (not safe)
          //  System.out.println(s+" ");
          
    
    }

}
