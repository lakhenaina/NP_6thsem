import java.io.*;
import java.net.*;
public class MyClient {
    public static void main(String[] args)throws IOException {
        Socket clientSocket = new Socket("localhost", 1234);
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
        BufferedReader in = new BufferedReader(new
            InputStreamReader(clientSocket.getInputStream()));
            int a =5;
            int b =6;
            out.println(a + " "+b);
            String serverResponse = in.readLine();
            System.out.println("Sum from server: "+ serverResponse);
            clientSocket.close();

        
    }
}