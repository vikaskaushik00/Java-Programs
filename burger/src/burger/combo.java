package burger;
import java.util.Scanner;

public class combo {
    private BasicHamburger basicHamburger;
    private FourAdditional fourAdditional;
    private int meatTypeOption;
    private int additionalOption;

    public combo(BasicHamburger basicHamburger,FourAdditional fourAdditional){
        this.basicHamburger = basicHamburger;
        this.fourAdditional = fourAdditional;
    }

    Scanner input = new Scanner(System.in);

    public void basic(){
        //meat type
        basicHamburger.meat();
        meatTypeOption = input.nextInt();
        if(meatTypeOption == 1){
            System.out.println("You Choose for Chicken \u20B950");
        }
        else if(meatTypeOption == 2){
            System.out.println("You choose for Mutton \u20B950");
        }
        else
            System.out.println("Wrong Input");

        //Additional Items
        System.out.println("You want additional item "+"\n"+
                "Press 1 for YES "+"\n"+
                "Press 2 for NO");
        additionalOption = input.nextInt();
        if (additionalOption == 1){
            fourAdditional.additionalItems();
            System.out.println("Your burger is ready with additional items"+"\n"+
                    "Total Price is "+fourAdditional.getPrice());

        }
        else if(additionalOption == 2){
            System.out.println("You do not choose for additional item"+"\n"+
                    "Your Burger is ready");
            System.out.println("Total Price is "+fourAdditional.getPrice());
        }
        else
            System.out.println("Wrong Input");
    }

}


