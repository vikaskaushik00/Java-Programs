package burger;
import java.util.Scanner;

public class Hamburger {
    private String rollType;
    private String meat;
    private BasicHamburger basicHamburger;
    private FourAdditional fourAdditional;
    private int burgerNumber;
    private combo combo;


    public Hamburger(String rollType, String meat, BasicHamburger basicHamburger, FourAdditional fourAdditional,combo combo) {
        this.rollType = rollType;
        this.meat = meat;
        this.basicHamburger = basicHamburger;
        this.fourAdditional = fourAdditional;
        this.combo = combo;

    }



    public void chooseBurger() {
        System.out.println("                           WELCOME TO BILL'S BURGER ");
        System.out.println("Choose type of Burger " + "\n" +
                "1 : Basic Hamburger " + "\n" +
                "2 : Healthy Burger" + "\n" +
                "3 : Deluxe Hamburger");
        Scanner input = new Scanner(System.in);
        burgerNumber = input.nextInt();

        //Basic Burger
        if (burgerNumber == 1) {
            System.out.println("You choose for basic burger");
            basicHamburger.choose();
            basicHamburger.breadType();
            combo.basic();
        }
        //*************************************************************************************

        else if (burgerNumber == 2) {
            System.out.println("You choose for healthy burger");
            basicHamburger.choose();
            basicHamburger.breadType();
            combo.basic();
        }
        //**************************************************************************************

        else if (burgerNumber == 3) {
            System.out.println("You choose for Deluxe burger");
            basicHamburger.choose();
            basicHamburger.breadType();
            combo.basic();        }
        else
            System.out.println("Wrong input");

    }
}
