package whileLoop;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        while(count <= 5) {

            System.out.println("value is " + count);
            count++;
        }
        count = 6;
        do{
            System.out.println("value is " + count);
            count++;
            if(count == 100)
                break;
        } while (count != 6);

    }
}
