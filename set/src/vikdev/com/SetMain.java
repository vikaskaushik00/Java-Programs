package vikdev.com;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class SetMain {

    public static void main(String[] args) {
        Set<Integer> square = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            square.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + square.size() + " squares and " + cubes.size() + " cubes");
        Set<Integer> union = new HashSet<>(square);
        union.addAll(cubes);
        System.out.println("There are " + union.size() + " elements in union");

        Set<Integer> intersection = new HashSet<>(square);
        intersection.retainAll(cubes);
        System.out.println("There are " + intersection.size() + " elements in intersection");
        for (int i : intersection) {
            System.out.println(i + " square root is " + Math.sqrt(i) + " cube is " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentences = "One day in the year of the fox";
        String[] arr = sentences.split(" ");
        words.addAll(Arrays.asList(arr));
        for (String s : words) {
            System.out.println(s);
        }

        System.out.println("========================================================");
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        Set<String> coll = new HashSet<>(nature);
        coll.removeAll(divine);
        printSet(coll);



        Set<String> second = new HashSet<>(nature);
        second.retainAll(divine);
        coll.removeAll(second);
        printSet(coll);

        Set<String> third = new HashSet<>(nature);
        third.retainAll(divine);


        if (nature.containsAll(divine)){
            System.out.println("dive is the subset of the nature ");
        }
        if (nature.containsAll(third)){
            System.out.println("Second is subset of nature");
        }
        if (divine.containsAll(second)){
            System.out.println("Second is subset of divine");
        }
    }

    public static void printSet(Set<String> set){
        System.out.println("\t");
        for (String s : set) {
            System.out.print(s +" ");
        }
    }



}
