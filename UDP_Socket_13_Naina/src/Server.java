import java.net.*;
public class Server {
    public static void main(String[] args) {
        try{
            DatagramSocket serverSocket = new DatagramSocket(5000);
            byte[] receiveBuffer = new byte[1024];
            DatagramPacket receivedPacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            System.out.println("Server is waiting for a packet......");
            serverSocket.receive(receivedPacket);
            String receivedMessage = new String(receivedPacket.getData(),0,receivedPacket.getLength());
            System.out.println("Received:" + receivedMessage);
            serverSocket.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}