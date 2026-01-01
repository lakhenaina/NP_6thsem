// Lab 1. Write a program to find the address and hostname of the local machine.
import java.net.*;

public class LocalHostInfo {
    public static void main(String[] args) throws Exception {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostAddress());
        System.out.println(localHost.getHostName());
    }
}
