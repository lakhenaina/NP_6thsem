//Write a java program to check IP address as Spammer.
import java.net.InetAddress;
import java.net.*;

public class SpamCheck {
    public static final String BHSERVICE = "sbl.spamhaus.org";
    public static void main(String[] args) throws UnknownHostException {

String[] str=new String[]{"125.12.32.4","94.181.33.149","207.34.56.23"};
            for (String st: str) {
                if (isKnownSpammer(st)) {
                    System.out.println(st + " is a known spammer.");
                }
                else {
                    System.out.println(st + "  doesn't appear to be a spammer.");
                }
                           
            }
           
        }        
    
    private static boolean isKnownSpammer(String arg) {
        try {
            InetAddress address = InetAddress.getByName(arg);
            byte[] quad = address.getAddress();
            String query = BHSERVICE;
            for (byte octet : quad) {
                int unsignedByte = octet < 0 ? octet + 256 : octet;
                query = unsignedByte + "." + query;
                            }
            InetAddress.getByName(query);
            return true;
        } catch (UnknownHostException e) {
            return false;
        }
    }

}



