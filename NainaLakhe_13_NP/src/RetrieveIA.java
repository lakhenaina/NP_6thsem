import java.net.*;

public class RetrieveIA {
    public static void main(String[] args) throws Exception {
        InetAddress localHost = InetAddress.getLocalHost();
        String host = localHost.getHostName();
        String ipAddr = localHost.getHostAddress();

        NetworkInterface netIf = NetworkInterface.getByInetAddress(localHost);
        byte[] macAddr = netIf.getHardwareAddress();

        System.out.println("Hostname: " + host);
        System.out.println("IP Address: " + ipAddr);
        System.out.print("MAC Address: ");

        if (macAddr != null) {
            for (int i = 0; i < macAddr.length; i++) {
                System.out.printf("%02X", macAddr[i]);
                if (i < macAddr.length - 1) {
                    System.out.print("-");
                }
            }
            System.out.println();
        } else {
            System.out.println("Address not available.");
        }
    }
}
