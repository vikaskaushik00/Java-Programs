package vikdev.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.flickr.com/services/feeds/photos_public.gne?tags=dogs");
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setRequestProperty("User-Agent", "Chrome");
            urlConnection.setReadTimeout(30000);

            int response = urlConnection.getResponseCode();
            System.out.println("Response code : " + response + " -> " + urlConnection.getResponseMessage());

            if (response != 200){
                System.out.println("Error reading web page ");
                return;
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String string;
            while ((string = reader.readLine()) != null){
                System.out.println(string);
            }
            reader.close();

//            urlConnection.setDoOutput(true);
//            urlConnection.connect();
//
//
//            Map<String, List<String>> headers = urlConnection.getHeaderFields();
//            for (Map.Entry<String,List<String>> all : headers.entrySet()){
//                String key = all.getKey();
//                System.out.println("-----key = " + key);
//                List<String> list = all.getValue();
//                for (String value : list){
//                    System.out.println("value = " +  value);
//                }
//            }
//
//
//
        }catch (IOException u){
            System.out.println(u.getMessage());
        }
    }
}
// BASIC CODE TO LEARN FIRST
//            URI base = new URI("http://username:password@myserver.com:5000");
//            URI uri1 = new URI("/catalogue/phones?os=android#Samsung");
//            URI uri2 = new URI("/catalogue/tvs?manufacturer=Samsung");
//            URI uri3 = new URI("/stores/locations?zip=12345");
//
//            URI resolve1 = base.resolve(uri1);
//            URI resolve2 = base.resolve(uri2);
//            URI resolve3 = base.resolve(uri3);

//URI uri = new URI("hello"); // contains only scheme specific part.

//            URL url1 = resolve1.toURL();
//            System.out.println("URL 1 : " + url1);
//
//            URL url2 = resolve2.toURL();
//            System.out.println("URL 2 : " + url2);
//
//            URL url3 = resolve3.toURL();
//            System.out.println("URL 3 : " + url3);
//
//            URI relative = base.relativize(resolve2);
//            System.out.println("Relative : " + relative);

//            System.out.println("Scheme : " + uri.getScheme());
//            System.out.println("Scheme-specific-part : " + uri.getSchemeSpecificPart());
//            System.out.println("Authority : " + uri.getAuthority());
//            System.out.println("User info : " + uri.getUserInfo());
//            System.out.println("Host : " + uri.getHost());
//            System.out.println("Port : " + uri.getPort());
//            System.out.println("Path : " + uri.getPath());
//            System.out.println("Query : " + uri.getQuery());
//            System.out.println("Fragment : " + uri.getFragment());
