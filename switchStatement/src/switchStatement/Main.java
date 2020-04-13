package switchStatement;

public class Main {

    public static void main(String[] args) {

    int value = 4;
    switch(value) {
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("value is :" + value);
            break;

        default:
            System.out.println("Value is neither 1 nor 2");
            break;

    }
    char alpha = 'c';
    switch (alpha) {
        case 'a':
            System.out.println("Character is a");
            break;
        case 'b':
            System.out.println("Character was b");
            break;
        case 'c': case 'd': case 'e':
            System.out.println("Character is " + alpha);
            break;

        default:
            System.out.println("value is different than a, b, c, d, e");
            break;

    }

    String mon = "jUne";
    switch (mon.toLowerCase()) {
        case "january": case "june": case "july":
             System.out.println(mon.toLowerCase());
             break;
        default:
            System.out.println("value is wrong ");
            break;


    }

    }
}




