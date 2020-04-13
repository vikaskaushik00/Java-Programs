package isEvenNumber;


public class Main {

    public static void main(String[] args) {

        int number = 4,number2 = 20, count = 0;
        while(number <= number2){
            number++;
           if( !isEvenNumber(number)) {
               continue;
           }



               count++;
               if(count >= 5){
                   break;
               }
               else
                   continue;

           }



        }


    public static boolean isEvenNumber(int number) {



        if(number < 0) {

            return false;
        }
        else {
            if (number % 2 == 0) {
                System.out.println("Number is even " + number);
                return true;
            }
            else {
                return false;
            }
        }



    }





}
