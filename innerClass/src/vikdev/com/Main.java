package vikdev.com;

import java.util.Scanner;

public class Main {
private static Button button = new Button("Print");
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        GearBox gearBox = new GearBox(5);
//       gearBox.addGear(1,5.3);
//        gearBox.addGear(2,10.3);
//        gearBox.addGear(3,15.3);
//
//        gearBox.operateClutch(true);
//        gearBox.changeGear(1);
//        gearBox.operateClutch(false);
//        System.out.println(gearBox.wheelSpeed(1000));
//        gearBox.changeGear(2);
//        System.out.println(gearBox.wheelSpeed(2000));



//        class On implements Button.OnClickListener{
//            public On(){
//                System.out.println("I am attached");
//            }
//
//            public void OnClick(String title){
//                System.out.println("Clicked");
//            }
//        }
//
//        button.setOnClickListener(new On());

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void OnClick(String title) {
                System.out.println("Clicked");
            }
        });
        System.out.println("0 : quit\n"+
                "1 : click button");
        Listen();


        Button.OnClickListener obj = new Button.OnClickListener(){
            public void OnClick(String title) {
                System.out.println("Clicked");
            }
        };
    }

    public static void Listen(){

        boolean quit = true;
        while (quit){
            System.out.println("Enter choice");
            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose){
                case 0:
                    System.out.println("Quiting");
                    quit = false;
                    break;
                case 1:
                    button.onClick();
                    break;
                default:System.out.println("Wrong");
            }
        }
    }
}
