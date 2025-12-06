import java.net.*;
import java.io.*;
public class Multithreaded_MyClient {
    public static void main(String[] args)throws Exception {
        Socket clientSocket = new Socket("localhost",1234);
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out.println("Content from Client");
        String serverResponse = in.readLine();
        System.out.println("Content from server: "+serverResponse);
        clientSocket.close();
    }
}
