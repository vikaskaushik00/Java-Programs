package sumCalculator;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator sum = new SimpleCalculator();
        sum.setFirstNumber(5.0);
        sum.setSecondNumber(4);
        System.out.println("First number is : " + sum.getFirstNumber());
        System.out.println("Second number is : " + sum.getSecondNumber());
        System.out.println("Addition is : " + sum.getAdditionResult());
        System.out.println("Subtraction is : "+ sum.getSubtractionResult());
        System.out.println("Multiplication is : "+ sum.getMultiplicationResult());
        System.out.println("Division is : " + sum.getDivisionResult());
    }

}
