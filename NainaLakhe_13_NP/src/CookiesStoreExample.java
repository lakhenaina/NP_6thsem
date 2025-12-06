import java.net.*;
import java.io.*;
import java.util.*;

public class CookiesStoreExample {
    public static void main(String[] args) throws IOException {
        final String URL_STRING = "http://www.samriddhicollege.edu.np";  
        CookieManager cookieManager = new CookieManager();
        CookieStore cookieStore = cookieManager.getCookieStore();

        HttpCookie cookieA = new HttpCookie("First", "1");
        HttpCookie cookieB = new HttpCookie("Second", "2");

        cookieA.setMaxAge(3600); // 1 hour
        cookieB.setSecure(true); // Secure cookie

        URI uri = URI.create(URL_STRING);
        cookieStore.add(uri, cookieA);
        cookieStore.add(uri, cookieB);  // cannot use null

        System.out.println("Cookies successfully added\n");

        List<HttpCookie> cookiesWithURI = cookieStore.get(uri);
        System.out.println("Cookies associated with URI in CookieStore: " + cookiesWithURI + "\n");

        List<HttpCookie> cookieList = cookieStore.getCookies();
        System.out.println("Cookies in CookieStore: " + cookieList + "\n");

        List<URI> uriList = cookieStore.getURIs();
        System.out.println("URIs in CookieStore: " + uriList + "\n");

        System.out.println("Removal of Cookie: " + cookieStore.remove(uri, cookieA));
        System.out.println("Remaining Cookies: " + cookieList + "\n");

        System.out.println("Removal of all Cookies: " + cookieStore.removeAll());
        System.out.println("Empty CookieStore: " + cookieList);
    }
}
