import java.io.*;
import java.net.*;
public class MyClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost",12345);
        InputStream inputStream = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int bytesRead = inputStream.read(buffer);
        String receivedData = new String(buffer, 0 , bytesRead);
        System.out.println("Received" +receivedData);
        socket.close();
    }
}
