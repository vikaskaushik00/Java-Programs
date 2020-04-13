package overloadingChallange;

public class Main {

    public static void main(String[] args) {

       System.out.println(calcFeetAndInchesToCentimeters(-156));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet >=0) && ((inches >= 0) && (inches <= 12))) {

            double cm = feet / 0.032808;
            double cmInch = inches / 0.39370;
            double sum = cm + cmInch;
            System.out.println(feet +" feet and " + inches +"inches is equal to : " + sum + " centimeter");
            return 1;

        }
        else
            return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0){
            double ft = (int)inches / 12;
            double reminch = inches % 12;
            return  calcFeetAndInchesToCentimeters(ft, reminch);
        }
        else
            return -1;
    }
}
