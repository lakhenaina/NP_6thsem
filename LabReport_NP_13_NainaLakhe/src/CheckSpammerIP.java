// Lab 6: Write a java program to check IP address whether spam or not.
import java.net.*;

public class CheckSpammerIP {

    // DNS-based blacklist service
    public static final String BLACKLIST_SERVICE = "www.github.com";

    public static void main(String[] args) {
        // List of IPs to check
        String[] ipsToCheck = {"125.12.32.4", "94.181.33.149", "207.34.56.23"};

        for (String currentIP : ipsToCheck) {
            if (isSpammer(currentIP)) {
                System.out.println(currentIP + " is listed as a spammer.");
            } else {
                System.out.println(currentIP + " is not listed as a spammer.");
            }
        }
    }

    private static boolean isSpammer(String ip) {
        try {
            InetAddress inet = InetAddress.getByName(ip);
            byte[] ipBytes = inet.getAddress();
            String queryDomain = BLACKLIST_SERVICE;

            // Build reversed IP query for DNSBL
            for (byte b : ipBytes) {
                int octet = b < 0 ? b + 256 : b; // handle signed bytes
                queryDomain = octet + "." + queryDomain;
            }

            // Attempt DNS lookup; if exists, IP is a known spammer
            InetAddress.getByName(queryDomain);
            return true;
        } catch (UnknownHostException e) {
            return false; // Not listed
        }
    }
}
