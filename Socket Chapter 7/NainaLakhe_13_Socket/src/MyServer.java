import java.io.*;
import java.net.*;
public class MyServer{
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket= new ServerSocket(12345);
        Socket socket = serverSocket.accept();
        OutputStream outputStream = socket.getOutputStream();
        String str = "Hello";
        byte[] byteArray = str.getBytes();
        outputStream.write(byteArray);
        socket.close();
        serverSocket.close();
    }
}