package burger;
import java.util.Scanner;

public class FourAdditional {

    private int additionalItemType;
    private int price = 100;

    public int getPrice() {
        return price;
    }

    Scanner input = new Scanner(System.in);

    public void setAdditionalItemType(int additionalItemType) {
        this.additionalItemType = additionalItemType;
    }


    public void additionalItems() {
        System.out.println("You Choose for additional Items Choose from below which items you want  " + "\n" +
                "1 : Cheese \u20B930" + "\n" +
                "2 : Tomato \u20B920" + "\n" +
                "3 : Onion  \u20B920" + "\n" +
                "4 : Carrot \u20B910");
        System.out.println("You want to add cheese \u20B930? " + "\n" +
                "Press 1 for Yes" + "\n" +
                "Press 2 for No");
        additionalItemType = input.nextInt();
        if (additionalItemType == 1) {
            System.out.println("Cheese has been added of \u20B930 ");
            price = price + 30;

        } else if (additionalItemType == 2) {
            System.out.println("Cheese has not been added");
        } else {
            System.out.println("Wrong Input");
        }
        System.out.println("You want to add Tomato \u20B920? " + "\n" +
                "Press 1 for Yes" + "\n" +
                "Press 2 for No");
        additionalItemType = input.nextInt();
        if (additionalItemType == 1) {
            System.out.println("Tomato has been added of \u20B920 ");
            price = price + 20;

        } else if (additionalItemType == 2) {
            System.out.println("Tomato has not been added");
        } else {
            System.out.println("Wrong input");
        }
        System.out.println("You want to add Onion \u20B920 ? " + "\n" +
                "Press 1 for Yes" + "\n" +
                "Press 2 for No");
        additionalItemType = input.nextInt();
        if (additionalItemType == 1) {
            System.out.println("Onion has been added of \u20B920 ");
            price = price + 20;

        } else if (additionalItemType == 2) {
            System.out.println("Onion has not been added");
        } else {
            System.out.println("Wrong input");
        }
        System.out.println("You want to add Carrot \u20B910? " + "\n" +
                "Press 1 for Yes" + "\n" +
                "Press 2 for No");
        additionalItemType = input.nextInt();
        if (additionalItemType == 1) {
            System.out.println("Carrot has been added of \u20B910 ");
            price = price + 10;

        } else if (additionalItemType == 2) {
            System.out.println("Carrot has not been added");
        } else {
            System.out.println("Wrong input");
        }

    }


    //************************************************************************************************************

    public void additionalItemsHealthy() {
        System.out.println("You Choose for additional Items Choose from below which items you want  " + "\n" +
                "1 : Cheese \u20B930" + "\n" +
                "2 : Tomato \u20B920" + "\n" +
                "3 : Onion  \u20B920" + "\n" +
                "4 : Carrot \u20B910" + "\n" +
                "5 : Mushroom \u20B930" + "\n" +
                "6 : Turkey \u20B950");
        System.out.println("You want to add cheese \u20B930? " + "\n" +
                "Press 1 for Yes" + "\n" +
                "Press 2 for No");
        additionalItemType = input.nextInt();
        if (additionalItemType == 1) {
            System.out.println("Cheese has been added of \u20B930 ");
            price = price + 30;

        } else if (additionalItemType == 2) {
            System.out.println("Cheese has not been added");
        } else {
            System.out.println("Wrong Input");
        }
        System.out.println("You want to add Tomato \u20B920? " + "\n" +
                "Press 1 for Yes" + "\n" +
                "Press 2 for No");
        additionalItemType = input.nextInt();
        if (additionalItemType == 1) {
            System.out.println("Tomato has been added of \u20B920 ");
            price = price + 20;

        } else if (additionalItemType == 2) {
            System.out.println("Tomato has not been added");
        } else {
            System.out.println("Wrong input");
        }
        System.out.println("You want to add Onion \u20B920? " + "\n" +
                "Press 1 for Yes" + "\n" +
                "Press 2 for No");
        additionalItemType = input.nextInt();
        if (additionalItemType == 1) {
            System.out.println("Onion has been added of \u20B920 ");
            price = price + 20;

        } else if (additionalItemType == 2) {
            System.out.println("Onion has not been added");
        } else {
            System.out.println("Wrong input");
        }
        System.out.println("You want to add Carrot \u20B910? " + "\n" +
                "Press 1 for Yes" + "\n" +
                "Press 2 for No");
        additionalItemType = input.nextInt();
        if (additionalItemType == 1) {
            System.out.println("Carrot has been added of \u20B910 ");
            price = price + 10;

        } else if (additionalItemType == 2) {
            System.out.println("Carrot has not been added");
        } else {
            System.out.println("Wrong input");
        }
        System.out.println("You want to add Mushroom \u20B930 ? " + "\n" +
                "Press 1 for Yes" + "\n" +
                "Press 2 for No");
        additionalItemType = input.nextInt();
        if (additionalItemType == 1) {
            System.out.println("Mushroom has been added of \u20B930 ");
            price = price + 30;

        } else if (additionalItemType == 2) {
            System.out.println("Mushroom has not been added");
        } else {
            System.out.println("Wrong Input");
        }
        System.out.println("You want to add Turkey \u20B950 ? " + "\n" +
                "Press 1 for Yes" + "\n" +
                "Press 2 for No");
        additionalItemType = input.nextInt();
        if (additionalItemType == 1) {
            System.out.println("Turkey has been added of \u20B950 ");
            price = price + 50;

        } else if (additionalItemType == 2) {
            System.out.println("Turkey has not been added");
        } else {
            System.out.println("Wrong Input");
        }

    }

    public void additionalItemsDeluxe() {
            System.out.println("You Choose for additional Items Choose from below which items you want  " + "\n" +
                    "1 : Cold Drink \u20B960" + "\n" +
                    "2 : Chips \u20B950" + "\n");
        System.out.println("You want to add  Cold Drink \u20B960? " + "\n" +
                "Press 1 for Yes" + "\n" +
                "Press 2 for No");
        additionalItemType = input.nextInt();
        if (additionalItemType == 1) {
            System.out.println("Cold drink has been added of \u20B960 ");
            price = price + 60;

        } else if (additionalItemType == 2) {
            System.out.println("Cold drink has not been added");
        } else {
            System.out.println("Wrong Input");
        }
        System.out.println("You want to add Chips \u20B950? " + "\n" +
                "Press 1 for Yes" + "\n" +
                "Press 2 for No");
        additionalItemType = input.nextInt();
        if (additionalItemType == 1) {
            System.out.println("Chips has been added of \u20B950 ");
            price = price + 50;

        } else if (additionalItemType == 2) {
            System.out.println("Chips has not been added");
        } else {
            System.out.println("Wrong input");
        }
        }
    }

