// Lab 4:Write a java program to check Loopbackaddress,Private address,multicast address, anylocaladdress.
import java.net.*;

public class AddressCheck {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress addr = InetAddress.getByName("127.0.0.1");
        if (addr.isLoopbackAddress()) {
            System.out.println(addr + " is a loopback address.");
        }

        addr = InetAddress.getByName("192.168.1.1");
        if (addr.isSiteLocalAddress()) {
            System.out.println(addr + " is a private address.");
        }

        addr = InetAddress.getByName("224.0.0.1");
        if (addr.isMulticastAddress()) {
            System.out.println(addr + " is a multicast address.");
        }

        addr = InetAddress.getByName("0.0.0.0");
        if (addr.isAnyLocalAddress()) {
            System.out.println(addr + " is the unspecified address.");
        }
    }
}
