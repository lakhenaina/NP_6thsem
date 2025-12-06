// write a java program to create a simple multithrreaded server using socket.
import java.io.*;
import java.net.*;
public class Multithreaded_MyServer {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(1234);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("New Client Connected");
            //create a new thread to handle the client
            new ClientHandler(socket).start();
            
        }
    }
}
class ClientHandler extends Thread{
     private Socket socket;
     public ClientHandler(Socket socket){
        this.socket= socket;
     }
     public void run(){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
            String text = "Hello from Server";
            System.out.println("Received: "+reader.readLine());
            writer.println("Send: "+text);
            socket.close();
        }catch (IOException ex){
            System.err.println("Server exception: "+ex.getMessage());
            ex.printStackTrace();
        }
     }

}
