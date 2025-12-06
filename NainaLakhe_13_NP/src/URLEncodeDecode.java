//write a java program to perform url encoding and decoding.

import java.net.*;
import java.io.*;

public class URLEncodeDecode {
    public static void main(String[] args) {
        try {
        String url1=URLEncoder.encode("https://khwopacollege.edu.np/bca-college-in-kathmandu-valley/","UTF-8");//dencode
            System.out.println(url1);
           String deURL= URLDecoder.decode(url1);//decode
           System.out.println(deURL);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
