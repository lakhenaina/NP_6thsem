import java.net.*;

public class IPAddressCheck {
    public static void main(String[] args) throws UnknownHostException {
        // IPs to check
        String[] arr = {"127.0.0.1", "192.168.1.1", "224.0.0.1", "0.0.0.0"};

        for (String ipAddr : arr) {
            InetAddress address = InetAddress.getByName(ipAddr);

            if (address.isLoopbackAddress()) {
                System.out.println(ipAddr + " is a loopback address.");
            } 
            else if (address.isSiteLocalAddress()) {
                System.out.println(ipAddr + " is a private address.");
            } 
            else if (address.isMulticastAddress()) {
                System.out.println(ipAddr + " is a multicast address.");
            } 
            else if (address.isAnyLocalAddress()) {
                System.out.println(ipAddr + " is the unspecified address.");
            }
        }
    }
}
