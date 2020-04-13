package vikdev.com;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
  // ISaveable players = new Players("Vikas","20","fighter");
   ISaveable iSaveable = new ISaveable() {


           private String name;
           private String health;
           private String character;



           public String getName() {
               return name;
           }

           public String getHealth() {
               return health;
           }

           public String getCharacter() {
               return character;
           }

           public ArrayList<String> write() {
               ArrayList<String> all = new ArrayList<String>();
               all.add(0, this.name);
               all.add(1, this.character);
               all.add(2, this.health);
               return all;

           }

           @Override
           public String toString() {
               return "Players{" +
                       "name='" + name + '\'' +
                       ", health='" + health + '\'' +
                       ", character='" + character + '\'' +
                       '}';
           }

           public void read(ArrayList<String> load) {
               if (load != null && load.size() > 0) {
                   this.name = load.get(0);
                   this.character = load.get(1);
                   this.health = load.get(2);
               }
           }


   };




    save(iSaveable);
    load(iSaveable);
    System.out.println(iSaveable);

    }

    public static void save(ISaveable objectToSave){
        for (int i = 0;i< objectToSave.write().size();i++){
            System.out.println("Saving "+objectToSave.write().get(i)+" to storage device");
        }
    }

    public static void load(ISaveable objectToLoad){
        ArrayList<String > all = enter();
        objectToLoad.read(all);
    }

    public static ArrayList<String> enter(){
        ArrayList<String> work = new ArrayList<String>();
        boolean quit = true;

        int index = 0;
        System.out.println("Available options\n"+"Press\n"+
                "0 : quit\n"+
                "1 : enter String");
        while (quit){

            System.out.println("Enter choice");
            int  choose = scan.nextInt();
            scan.nextLine();
            switch (choose){
                case 0:
                    System.out.println("Application closed");
                    quit = false;
                    break;
                case 1:
                    System.out.println("Enter String");
                    String value = scan.nextLine();
                    work.add(index,value);
                    index++;
                    break;
            }

        }
        return work;

    }


}
