// Lab 2: Write a java program to find canonicalHostName, HostName, IpAddress of www.github.com
import java.net.*;
public class HostDetails {
    public static void main(String[] args) throws UnknownHostException {
      InetAddress addr = InetAddress.getByName("www.github.com");
      System.out.println(addr.getCanonicalHostName());
      System.out.println(addr.getHostAddress());  
      System.out.println(addr.getHostName());  
      byte[] arr =addr.getAddress();  
      for(byte b : arr)
      {
      System.out.println(b);
      }
    }
}
