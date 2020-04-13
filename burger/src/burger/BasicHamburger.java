package burger;
import java.util.Scanner;

public class BasicHamburger {
    private String breadType;
    private String meatType;
    private int breadTypeOption;

    Scanner input = new Scanner(System.in);


    public void breadType() {
        breadTypeOption = input.nextInt();
        // Bread type option
        if (breadTypeOption == 1) {
            System.out.println("You choose for white bread");
        } else if (breadTypeOption == 2) {
            System.out.println("You choose for brown bread");
        } else
            System.out.println("Wrong Input");

    }


    public void choose(){
        System.out.println("Choose Bread Type"+"\n"+
                "Which type of bread you want"+"\n"+
                "1 : White bread "+"\n"+
                "2 : Brown bread");
    }
    public void meat(){
        System.out.println("Which Type of meat you want "+"\n"+
                            "1 : Chicken \u20B950" +"\n"+
                            "2 : Mutton  \u20B950 ");
    }


}
