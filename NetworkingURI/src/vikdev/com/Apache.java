package vikdev.com;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Apache {
    public static void main(String[] args) {
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://example.org");
        httpGet.addHeader("User-Agent", "Chrome");

        CloseableHttpResponse response = null;
        try{
            response = closeableHttpClient.execute(httpGet);
            System.out.println("Response code = " + response.getStatusLine().getStatusCode());

            BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String string;
            while ((string = reader.readLine()) != null){
                System.out.println(string);
            }


        }catch (IOException e){
            System.out.println("IOException = " + e.getMessage());
        }finally {
            try{
                response.close();
            }catch (IOException e){
                System.out.println("not closed");
                e.printStackTrace();
            }
        }
    }

}
