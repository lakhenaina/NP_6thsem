import java.net.*;
public class Client{
    public static void main(String[] args) throws Exception {
        DatagramSocket clientSocket = new DatagramSocket();
        String message="Hello, UDP Server!";
        byte[] sbuffer = message.getBytes();
        InetAddress serrverAddres = InetAddress.getByName("localhost");
        DatagramPacket sendPacket = new DatagramPacket(sbuffer,sbuffer.length,serrverAddres,5000);
        clientSocket.send(sendPacket);
        clientSocket.close();
    }
}