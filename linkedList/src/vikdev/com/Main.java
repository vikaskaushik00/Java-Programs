package vikdev.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<String>();
        add(cities,"Delhi");
        add(cities,"Jaipur");
        add(cities,"Ghaziabad");
        add(cities,"Mumbai");
        add(cities,"Lucknow");
        add(cities,"Pune");
        places(cities);
        visit(cities);

    }
    private static void places(LinkedList<String> cities){
        Iterator<String> i = cities.iterator();
        while (i.hasNext()){
            System.out.println(". "+i.next());
        }
        System.out.println("=============================");
    }

    private static boolean add(LinkedList<String> charList,String city){
        ListIterator<String> j = charList.listIterator();

        while (j.hasNext()){
            int comp = j.next().compareTo(city);

            if (comp == 0){
                System.out.println(city+" already exist ");
                return false;
            }
            else if (comp > 0){
                j.previous();
                j.add(city);
                return true;
            }
            else if (comp < 0){

            }
        }
        j.add(city);
       return true;
    }

    private  static void visit(LinkedList<String> toVisit){
        ListIterator<String> change = toVisit.listIterator();
        Scanner scan = new Scanner(System.in);
        boolean quit = true;
        if (toVisit.isEmpty()){
            return;
        }else {
            System.out.println("Now we are visiting "+change.next());
            printMenu();
        }
        while (quit){
            System.out.println("Enter your choice : ");
            int choose = scan.nextInt();
            scan.nextLine();

            switch (choose){
                case 0:
                    System.out.println("Shutting down application.. ");
                    quit = false;
                    break;
                case 1:
                    if (change.hasNext()){
                        System.out.println("We are visiting next city  "+change.next());
                    }else {
                        System.out.println("reached end of the list");
                    }
                    break;
                case 2:
                    if (change.hasPrevious()){
                        System.out.println("We are visiting previous city"+change.previous());
                    }else {
                        System.out.println("reached starting of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                default:
                    System.out.println(" WRONG INPUT ");
                    break;
            }

        }

    }
    public static void printMenu(){
        System.out.println("Available options\n"+"Press\n"+
                "0 : shut down application \n"+
                "1 : visit next city \n"+
                "2 : visit previous city \n"+
                "3 : print Menu ");
    }
}
