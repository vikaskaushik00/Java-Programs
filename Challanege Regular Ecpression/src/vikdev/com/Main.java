package vikdev.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        //Challenge 1
        String challenge1 = "I want a bike";
        String compare = "I want a bike";
        System.out.println("1 : " + challenge1.matches(compare));

        //challenge 2
        String challenge2 = "I want a bike";
        String compare2 = "I want a ball";
        String both = "I want a \\w+";

        System.out.println("2 : " + challenge2.matches(both));
        System.out.println("2 : " + compare2.matches(both));

        //Challenge 3
        String challenge3 = "I want a job";
        String both2 = "I want a \\w+";
        Pattern pattern = Pattern.compile(both2);
        Matcher matcher1 = pattern.matcher(challenge3);

        System.out.println("3 : " + matcher1.matches());

        //challenge 4
        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s","_"));

       // challenge 5
        String challenge5 = "aaabccccccccdddefffg";
        System.out.println("Challenge 5 :" + challenge5.matches("[a-g]+"));

        // challenge 6
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));

        // challenge 7
        String challenge7 = "abcd.135";
        System.out.println("7 : " + challenge7.matches("^[a-z]+\\.[0-9]+$"));

        //challenge 8
        String challenge8 = "abcd.135uvqz.7tzik.999";
        String regex8 = "([A-z][a-z]+)\\.(\\d+)([A-z][a-z]+)\\.(\\d)(\\D+)\\.(\\d+)";
        Pattern pattern8 = Pattern.compile(regex8);
        Matcher matcher8 = pattern8.matcher(challenge8);

        while (matcher8.find()){
            System.out.println("8 : " + matcher8.group(2) + ", " + matcher8.group(4) + ", " + matcher8.group(6));
        }

        //challenge 9
        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        String regex9 = "(\\D+)\\.(\\d+)\\s";
        //System.out.println(challenge9.matches(regex9));
        Pattern pattern9 = Pattern.compile(regex9);
        Matcher matcher9 = pattern9.matcher(challenge9);

        while (matcher9.find()){
            System.out.println("9 : " + matcher9.group(2));
        }

        //challenge 10
        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        String regex10 = "\\D+\\.(\\d+)\\s";
        //System.out.println(challenge9.matches(regex9));
        Pattern pattern10 = Pattern.compile(regex10);
        Matcher matcher10 = pattern10.matcher(challenge10);

        while (matcher10.find()){
            System.out.println("10 : " + matcher10.group(1) +" : " + matcher10.start(1) + " to " + (matcher10.end(1) - 1));
        }

        //challenge 11
        String challenge11 = "{0,2},{0,5},{1,3},{2,4}";
       // String regex11 = "\\{(\\d\\,\\d)\\}\\,*";
        String regex11 = "\\{(.+?)\\}";
        Pattern pattern11 = Pattern.compile(regex11);
        Matcher matcher11 = pattern11.matcher(challenge11);

        while (matcher11.find()){
            System.out.println("11 : " + matcher11.group(1) );
        }

        //Challenge 12
        String challenge12 = "11111";
        String regex12 = "[\\d]{5}";
        System.out.println("12 : " + challenge12.matches(regex12));

        //challenge 13
        String challenge13 = "11111-1111";
        String regex13 = "^\\d{5}-\\d{4}$";
        System.out.println("13 : " + challenge13.matches(regex13));

        //challenge 14
        String challenge14 = "11111-1111";
        String regex14 = "^\\d{5}(-\\d{4})?$";
        System.out.println("14 : " + challenge14.matches(regex14));

        // Indian number Regex
        String indiaRegex = "^(\\+91){1}[1-9]{1}[0-9]{9}$";
        String number = "+918433103747";
       if(number.matches(indiaRegex)){
           System.out.println("This number is indian ");
       }







    }
}
