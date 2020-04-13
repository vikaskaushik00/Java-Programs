package vikdev.com;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {

        String string = "I am vikas, yes i am";
        System.out.println(string);
        String change = string.replace("I","You");
        System.out.println(change);
        String alphanumeric = "dkajdifjknfkjooo";
        System.out.println(alphanumeric.replaceAll(".","Y"));// to replace entire string
        System.out.println(alphanumeric.replaceAll("^dkajd","VVV"));// for match pattern from beginning

        String alphanumericSecond = "dkajdifjdkjdknfkjooo";
        System.out.println(alphanumericSecond.replaceAll("^dkajd","Y"));
        System.out.println(alphanumeric.matches("^dkajdifjknfkjooo"));
        System.out.println(alphanumeric.matches("^dkajd")); // return false  because it matches the whole  string
        System.out.println(alphanumericSecond.replaceAll("fkjooo$","THE END"));// for match pattern from end
        System.out.println(alphanumeric.replaceAll("[dof]","V"));//to match for letter in square bracket
        System.out.println(alphanumeric.replaceAll("[dof]"," I replaced a letter here"));
        System.out.println(alphanumeric.replaceAll("[jin][fd]","V"));

        System.out.println("vikas".replaceAll("[Vv]ikas","Vikas"));

        String newAlphanumeric = "dkajdiiIiiDjdkjdknf5kjo99oo";

        System.out.println(newAlphanumeric.replaceAll("[^fk]","L"));//replace all except f and k

        System.out.println(newAlphanumeric.replaceAll("[dkaif34567]","L")); // replace all with L
        System.out.println(newAlphanumeric.replaceAll("[a-kA-K3-7]","L")); // replace all from a to k and 3 to 7 with l
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-k3-7]","X"));//used to ignore case sensitivity in a range
        System.out.println(newAlphanumeric.replaceAll("[0-9]","YO")); //replace all digit in a range
        System.out.println(newAlphanumeric.replaceAll("\\d","YO"));//replace all digit
        System.out.println(newAlphanumeric.replaceAll("\\D","C")); // replace all non digit character

        String whiteSpace = "I have blank space \tand also tab space";
        System.out.println(whiteSpace.replaceAll("\\s","")); // remove all white space
        System.out.println(whiteSpace.replaceAll("\t","V")); // remove tab space
        System.out.println(whiteSpace.replaceAll("\\S","")); //remove all the non space character (Only tab space and new Line characters remain)
        System.out.println(whiteSpace.replaceAll("\\w","A"));// replace all a to z,0 to 9, both uppercase amd lowercase ,and underscore _
        System.out.println(whiteSpace.replaceAll("\\b","T")); //replace the boundaries of the character beginning and ending of character


        String thirdString = "abcdeeeefghhiiiiklmnoooo";
        System.out.println(thirdString.replaceAll("^abcde{4}","D")); //quantifier {value} which shows how many time a character can occur after which they are applied

        System.out.println(thirdString.replaceAll("^abcde+","X"));//also quantifier -> no need for curly braces

        System.out.println(thirdString.replaceAll("^abcde*","X"));//also quantifier -> don't care there is zero e or more

        System.out.println(thirdString.replaceAll("^abcde{2,5}","S")); // also quantifier -> match the character in range of times

        System.out.println(thirdString.replaceAll("h+i*k","S"));


        /*Matcher class*/
        StringBuilder htmlText = new StringBuilder("<h1> My heading one </h1>");
        htmlText.append("<h2> sub heading </h2>");
        htmlText.append("<p> This is the paragraph about something </p>");
        htmlText.append("<p> This is the another paragraph about something </p>");
        htmlText.append("<h2> Summery </h2>");
        htmlText.append("<p> Here is the summery </p>");

        String h2Pattern = "<h2>";

        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher1 = pattern.matcher(htmlText);
        System.out.println(matcher1.matches());

        matcher1.reset();
        int count  = 0;
        while (matcher1.find()){
            count++;
            System.out.println("Occurrence : " + count + " : " + matcher1.start() + " to " + matcher1.end());
        }


        String h2GroupPattern = "(<h2>.+?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher  = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()){
            System.out.println("Occurrence : " + groupMatcher.group(1));
        }

        String h2TextGroup = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroup);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while(h2TextMatcher.find()){
            System.out.println("Occurrence -> : " +h2TextMatcher.group(2));
        }


        String tvText = "tstvtkt";
       // String tNotVRegex = "t[^v]";
        String tNotVRegex = "t(?!v)";//negative look ahead means that it find the t which is not followed by the v
       // String tNotVRegex = "t(?=v)"; // positive look ahead means that it find the t which is followed by v

        Pattern pattern1 = Pattern.compile(tNotVRegex);
        Matcher matcherTv = pattern1.matcher(tvText);
        int count1 = 0;
        while (matcherTv.find()){
            count1++;
            System.out.println( "Occurrence : " +  count1 + " : " + matcherTv.start() + " to " + matcherTv.end());
        }


        //^((\+){1}91){1}[1-9]{1}[0-9]{9}$  -> Indian phone number Regex
        String phone1 = "+918433103747";
        String phone2 = "8433101747";
        String phone3 = "(123) 567-8490";
        String phone4 = "+919899956502";

        System.out.println("Phone 1 - " + phone1.matches("^((\\+){1}91){1}[1-9]{1}[0-9]{9}$"));
        System.out.println("Phone 2 - " + phone2.matches("^((\\+){1}91){1}[1-9]{1}[0-9]{9}$"));
        System.out.println("Phone 3 - " + phone3.matches("^((\\+){1}91){1}[1-9]{1}[0-9]{9}$"));
        System.out.println("Phone 4 - " + phone4.matches("^((\\+){1}91){1}[1-9]{1}[0-9]{9}$"));

        //we can check visa mastercard pattern also by Regex

    }
}
