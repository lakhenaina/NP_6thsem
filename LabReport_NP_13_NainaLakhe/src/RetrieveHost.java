// Lab 3: Write a program to retrieve Hostname, IP Address and Mac Address of Local Machine.
import java.net.*;
public class RetrieveHost {
    public static void main(String[] args) throws Exception {
        InetAddress Addr = InetAddress.getLocalHost();
        String hostName = Addr.getHostName();
        String ipAddress = Addr.getHostAddress();
        NetworkInterface net = NetworkInterface.getByInetAddress(Addr);
        byte[] mac = net.getHardwareAddress();
        // Print the details
        System.out.println("Hostname: " + hostName);
        System.out.println("IP Address: " + ipAddress);
        System.out.print("MacAddress: ");
        if (mac != null) {
            for (int i = 0; i < mac.length; i++) {
                System.out.printf("%02X", mac[i]);
            }
        }
    }  
}
