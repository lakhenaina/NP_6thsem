//write a java program to find baseURL,relativeURL and resolvedURL from given url https://khwopacollege.edu.np/wp-content/uploads/2019/09/Networking_Programming-Syllabus.zip


import java.net.*;

public class URLExample {
    
       public static void main(String[] args) throws MalformedURLException {
        
        String baseurl="https://khwopacollege.edu.np/wp-content/uploads/2019/09/";
        String relativeUrl="Networking_Programming-Syllabus.zip";
        URL baseUrl=new URL(baseurl);
        URL resolvedRelativeUrl=new URL(baseUrl, relativeUrl);
        System.out.println("BaseUrl:"+baseurl);
        System.out.println("Relative Url:"+relativeUrl);
        System.out.println("Resolved Relative Url:"+resolvedRelativeUrl);       
        }
    }
 
