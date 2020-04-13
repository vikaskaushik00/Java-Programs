package vikdev.com;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    List<String> topName2015 = Arrays.asList(
            "Amelia",
            "olivia",
            "emily",
            "Isla",
            "Ava",
            "oliver",
            "jack",
            "Charlie",
            "harry",
            "Jacob"
    );
    long name = topName2015.stream().map(s -> s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase()).peek(System.out::println)
             .filter(s -> s.startsWith("A")).count();
    System.out.println(name);






//        Supplier<String> iLoveJava = () ->{
//            return "I Love Java";
//        };
//
//        String SupplierResult = iLoveJava.get();
//        System.out.println(SupplierResult);



//Challenge 1
//        Runnable runnable = () -> {
//            String myString = "Let's split the string";
//            String[] parts = myString.split(" ");
//            for (String s : parts){
//                System.out.println(s);
//            }
//        };
//        runnable.run();
        //Challenge 2
//
//        Function<String,String> lambdaFunction = s ->{
//          StringBuilder returnVal = new StringBuilder();
//          for (int i = 0; i < s.length(); i++){
//              if (i % 2 == 1) {
//                  returnVal.append(s.charAt(i));
//              }
//          }
//          return returnVal.toString();
//        };
//        String enter = "1234567890";
//        System.out.println(everySecondCharacter(lambdaFunction, enter));
//


    }

//    public static String everySecondCharacter(Function<String,String> function, String stringEnter){
//        return function.apply(stringEnter);
//    }
}
