import java.net.*;
public class IA {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("www.youtube.com");
        System.out.println(address.getCanonicalHostName());
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
        byte[] arr = address.getAddress();
        for (byte b : arr) {
            System.out.println(b);
        }
    }
}
