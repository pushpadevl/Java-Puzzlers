class Dog{
    public static void bark(){
        System.out.println("bhaun");
    }
}
class No_bhaun_Dog extends Dog{
   public static void bark(){
       System.out.println("bhakk");
   }
}
public class All_I_Get_is_Static{
    public static void main(String args[]){
        Dog woofer = new No_bhaun_Dog();
        No_bhaun_Dog nipper = new  No_bhaun_Dog();//the class name matters not the constructor name
        woofer.bark();
        nipper.bark();
    }
}