import java.io.*;
import java.net.*;

public class DownloadHTMLPage {
    public static void main(String[] args) throws Exception {
        String fileName = "index.html";

        try {
            URL siteUrl = new URL("https://www.google.com");
            URLConnection conn = siteUrl.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );

            BufferedWriter bw = new BufferedWriter(
                    new FileWriter(fileName)
            );

            String data;
            while ((data = br.readLine()) != null) {
                bw.write(data);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Download complete: " + fileName);

        } catch (IOException ex) {
            System.err.println("Failed: " + ex.getMessage());
        }
    }
}
