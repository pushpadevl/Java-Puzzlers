import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class P83_SecondDog {
    public static void main(String[] args) throws Exception {
        //P83_Dog d = (P83_Dog)new Exception();
        //P83_Dog d = (P83_Dog)Exception.class.newInstance();
        P83_Dog[] d = new P83_Dog[2];
        d[0] = P83_Dog.INSTANCE;
        //d[1] = new P83_Dog();
        d[1] = (P83_Dog) deepCopy(P83_Dog.INSTANCE);
        System.out.println(d[0] == d[1]);
        System.out.println(d[0] == P83_Dog.INSTANCE);
        System.out.println(d[1] == P83_Dog.INSTANCE);
        
        
    }

    public static Object deepCopy(Object obj){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();

            new ObjectOutputStream(bos).writeObject(obj);

            ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());

            return new ObjectInputStream(bin).readObject();
            
        }catch(Exception e){

            throw new IllegalArgumentException(e);

        }
    }
}
/*
This class may look like a singleton, but it isn’t. The problem is that Dog extends
Exception and Exception implements java.io.Serializable. This means that
Dog is serializable, and deserialization constitutes a hidden constructor. If you
serialize Dog.INSTANCE and deserialize the resulting byte sequence, you will end
up with another Dog, as demonstrated by the following program. 

The readResolve method can solve the copying problem. See P83_Dog

The main lesson of this puzzle is that a singleton class that implements
Serializable must have a readResolve method that returns its
 sole instance.

*/