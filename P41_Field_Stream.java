import java.io.*;
import java.util.*;

public class P41_Field_Stream{
    public static void main(String []args) throws IOException{
        copy("./puz41", "./newpuzz41");
    }

    static void copy(String src, String dest) throws IOException{
        InputStream in =null;
        OutputStream out = null;
        try{
            in=new FileInputStream(src);
            out =  new FileOutputStream(dest);
            byte[] buf=new byte[1024];
            int n;
            while((n=in.read(buf))>=0)
                out.write(buf,0,n);
        }
        finally{
            in.close();
            out.close();
        }
    }
}

/* The finally block wale close sentences should be 
 * enclosed within try catch clause to catch exception thrown 
 * by the close blocks. COz the CATCH block can also throw 
 * Exception.
 * The problem still doesn't show up Don't know why
 */