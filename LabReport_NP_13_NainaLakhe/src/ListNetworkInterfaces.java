// Lab 5: Write a java program to list all the network interfaces on the localmachine.
import java.io.*;
import java.net.*;
import java.util.*;

public class ListNetworkInterfaces {
    public static void main(String[] args) throws IOException {       

        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        
        while (nets.hasMoreElements()) {         
            NetworkInterface net = nets.nextElement();         
            System.out.println("Name: " + net.getName()); 
            System.out.println("Display Name: " + net.getDisplayName());
            System.out.println(); // empty line for readability                                      
        }    
    }
}
