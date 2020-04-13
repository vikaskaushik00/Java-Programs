package vikdev.com;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    ArrayList  item = new ArrayList();

	    item.add(7);
        item.add(8);
        item.add("Vikas");
        item.add(74);


        for (Object i : item){
            System.out.println((Integer) i);
        }

    }
}
