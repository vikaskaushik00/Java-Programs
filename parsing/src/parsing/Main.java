package parsing;

public class Main {

    public static void main(String[] args) {
        String changeToNumber = "2019.176";
        double number = Double.parseDouble(changeToNumber);
        changeToNumber += 1;
        number += 1;
        System.out.println(number+" "+changeToNumber);
    }
}



