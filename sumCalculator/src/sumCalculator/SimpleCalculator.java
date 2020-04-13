package sumCalculator;

public class SimpleCalculator {
    private double firstNumber,secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber() {
        return this.secondNumber;
    }
    public void setFirstNumber(double first) {
        this.firstNumber = first;
    }
    public void setSecondNumber(double second) {
        secondNumber = second;
    }
    public double getAdditionResult(){
        double add = 0;
        add = firstNumber + secondNumber;
        return add;
    }
    public double getSubtractionResult(){
        double subtraction;
        subtraction = secondNumber - firstNumber;
        return  subtraction;
    }

    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    public double getDivisionResult() {
        return firstNumber / secondNumber;
    }

}
