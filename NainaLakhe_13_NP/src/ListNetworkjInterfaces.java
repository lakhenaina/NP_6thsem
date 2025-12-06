import java.io.*;
import java.net.*;
import java.util.*;

public class ListNetworkjInterfaces {
    public static void main(String[] args) throws IOException {       
    Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces( );
                while (interfaces.hasMoreElements( )) 
                {         
                    NetworkInterface ni = (NetworkInterface) interfaces.nextElement( );         
                    System.out.println(ni.getName()); 
System.out.println(ni.getDisplayName());                                        
                }    

    }
}
