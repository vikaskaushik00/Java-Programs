package vikdev.com;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> elements = new LinkedList<Integer>();
        elements.add(5);
        elements.add(6);
        elements.add(7);
        elements.add(8);
        elements.add(9);
        elements.add(10);
        elements.add(11);
        elements.add(12);
        elements.add(13);

        int var = elements.size() / 2;
        System.out.println(elements.get(var));


    }
}
