import java.io.*;
import java.net.*;
public class MyServer {
    public static void main(String[] args)throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket clienSocket = serverSocket.accept();
        System.out.println("Connected to Client");
        PrintWriter out = new PrintWriter(clienSocket.getOutputStream(),true);
        BufferedReader in = new BufferedReader(new
            InputStreamReader(clienSocket.getInputStream())
        );
        String inputLine = in.readLine();
        System.out.println("Received from client: "+ inputLine);
        String[]numbers = inputLine.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int sum = a+b;
        System.out.println("Calculated sum: "+sum);
        out.println(sum);
        clienSocket.close();
        serverSocket.close();
    }
}
