//Lab 8: Lab: write a java program to spit different component of url from given
// url(https://www.google.com:443/search?q=java#results)

import java.net.*;

public class URLComponents {
    public static void main(String[] args) throws MalformedURLException {

        // New URL
        URL url1 = new URL("https://www.google.com:443/search?q=java#results");

        System.out.println("URL: " + url1.toString());
        System.out.println();
        System.out.println("Different components of the URL:");

        System.out.println("Protocol: " + url1.getProtocol());
        System.out.println("Hostname: " + url1.getHost());
        System.out.println("Port: " + url1.getPort());
        System.out.println("Default Port: " + url1.getDefaultPort());
        System.out.println("Path: " + url1.getPath());
        System.out.println("File: " + url1.getFile());
        System.out.println("Query: " + url1.getQuery());
        System.out.println("Reference: " + url1.getRef());
    }
}
