package vikdev.com;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Location> locations = new HashMap<Integer, Location>();
    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String,Integer> tempExit = new HashMap<>();

        locations.put(0, new Location(0, "You are sitting in front of computer learning java ",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W",2);
        tempExit.put("N",5);
        tempExit.put("S",4);
        tempExit.put("E",3);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));


        tempExit = new HashMap<>();
        tempExit.put("N",5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W",1);
        locations.put(3, new Location(3, "You are inside a building , a well house for a small spring ",tempExit));

//        locations.get(3).adExit("Q",0);
        tempExit = new HashMap<>();
        tempExit.put("N",1);
        tempExit.put("W",2);
        locations.put(4, new Location(4, "You are in a valley beside a stream ",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("S",1);
        tempExit.put("W",2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));

        System.out.println("*********************************************************");
        System.out.println("**************Colossal Cave Adventure Game***************\n");

        int loc = 1;
        while (true) {

            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }
            System.out.println("Available Options : ");
            HashMap<String, Integer> exit = locations.get(loc).getExit();
            for (String i : exit.keySet()) {
                System.out.print(i + "  ");
            }

            Map<String,String> match = new HashMap<String, String>();

            match.put("QUIT","Q");
            match.put("EXIT","Q");
            match.put("EAST","E");
            match.put("WEST","W");
            match.put("NORTH","N");
            match.put("SOUTH","S");

            System.out.println();
            String input = scanner.nextLine().toUpperCase();
            if (input.length() > 1){
                String[] words = input.split(" ");
                for (String i : words){
                    if (match.containsKey(i)){
                        input = match.get(i);
                        break;
                    }
                }
            }



            if (exit.containsKey(input)){
                loc = exit.get(input);
            }else {
                System.out.println("You cannot go in that direction ");
            }
        }


    }
}
