// Write a java program to find canonicalHostName, HostName, IpAddress of www.iost.com.np.
import java.net.*;
public class App {
    public static void main(String[] args) throws UnknownHostException {
      InetAddress address = InetAddress.getByName("www.google.com.np");
      System.out.println(address.getCanonicalHostName());
      System.out.println(address.getHostAddress());  
      System.out.println(address.getHostName());  
      byte[] arr =address.getAddress();  
      for(byte b : arr)
      {
      System.out.println(b);
      }
    }
}

