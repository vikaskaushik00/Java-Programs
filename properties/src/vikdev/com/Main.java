package vikdev.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.Properties;
public class Main {

    public static void main(String[] args) throws Exception {

        Properties p = new Properties();
        OutputStream os = new FileOutputStream("dataConfig.properties");
        p.setProperty("uname","vikas");
        p.store(os,null);

        InputStream s = new FileInputStream("dataConfig.properties");
        p.load(s);
        System.out.println(p.get("uname"));
    }
}
