package operators;
 public class Main{
     public static void main(String[] args){
         int result = 1 + 2;
         System.out.println("1 + 2 " + result);
         int change = result + 5;
         System.out.println(change);

         result = result * 10;
         System.out.println(" value of result is : " + result);

         result = result + 5;
         System.out.println(" value of result is : " + result);

         result = result / 7;
         System.out.println(" value of result is : " + result);
         System.out.println(change);

         change = result + 10;
         System.out.println(change);

         result = result % 3 ;
         System.out.println(result);

         result++;
         System.out.println(result);

         result *= 10;
         System.out.println(result);

         result += 5;
         System.out.println(result);

         result -= 10;
         System.out.println(result);

         result /= 5;
         System.out.println(result);

        boolean value = false;
        if(value == false) {
            System.out.println("the value is : " + value);
            System.out.println(" The value is boolean data type ");
        }

        int topScore = 90;
        if (topScore == 90){
            System.out.println("Your marks are good ");
        }

        int score = 80;
        if(topScore > score &&   topScore < 88 ) {
            System.out.println("your marks are less than top marks  ");
        }

        boolean isCar = true;
        if(isCar) {
            System.out.println("This is true ");
        }

        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("The car is true ");
        }

     }
 }