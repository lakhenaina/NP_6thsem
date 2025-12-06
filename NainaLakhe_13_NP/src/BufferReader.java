import java.io.IOException;
 import java.io.InputStream;
import java.net.*;
 public class BufferReader{
    public static void main(String[] args)  throws Exception{
        try{
            URL u= new URL("https://www.example.com");
            InputStream in=u.openStream();
            int c;
            while((c=in.read())!=-1)
            System.out.write(c);
            in.close();

        }catch(IOException ex){
        System.err.println(ex);
    }
 }
}