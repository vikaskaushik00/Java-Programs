package complexOperations;

public class Main {

    public static void main(String[] args) {

        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber two = new ComplexNumber(2.5,-1.5);
        one.add(1,1);
        System.out.println(one.getReal());
        System.out.println(one.getImaginary());
        one.subtract(two);
        System.out.println(one.getReal());
        System.out.println(one.getImaginary());
        two.subtract(one);
        System.out.println(two.getReal());
        System.out.println(two.getImaginary());



    }
}
