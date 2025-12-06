import java.io.*;
import java.net.*;
public class Localport {
    public static void main(String[] args) {
        for(int port = 1; port<=1024; port++){
            try{
                ServerSocket ss = new ServerSocket(port);
            }catch(IOException EX){
                System.out.println("There is a server on port"  + port +".");
            }
        }
    
}
}
