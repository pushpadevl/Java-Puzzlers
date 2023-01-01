class P48_Dog{
    public static void bark(){
        System.out.println("bhaun");
    }
}
class P48_No_bhaun_Dog extends P48_Dog{
   public static void bark(){
       System.out.println("bhakk");
   }
}
public class P48_Bark{
    public static void main(String args[]){
        P48_Dog woofer = new P48_No_bhaun_Dog();
        P48_No_bhaun_Dog nipper = new  P48_No_bhaun_Dog();//the class name matters not the constructor name
        woofer.bark();
        nipper.bark();
    }
}