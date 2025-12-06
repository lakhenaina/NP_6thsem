import java.net.*;
import java.io.*;
public class MyClient {
    public static void main(String[] args)throws Exception {
        Socket clienSocket = new Socket("localhost",1234);
        BufferedReader in = new BufferedReader(new
            InputStreamReader(clienSocket.getInputStream()));
            String serverResponse = in.readLine();
            System.out.println("Server says: "+ serverResponse);
            clienSocket.close();
        }
}
