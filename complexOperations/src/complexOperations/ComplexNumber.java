package complexOperations;

public class ComplexNumber {
   private double real,imaginary;

    public ComplexNumber(double real,double imaginary){
        this.real = real;
        this.imaginary = imaginary;

    }
    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }
    public void add(double real,double imaginary){
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }
    public void add(ComplexNumber c){
      this.real = c.real + this.real;
      this.imaginary = c.imaginary + this.imaginary;
    }
    public void subtract(double real,double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber c){
            this.real = this.real - c.real;
            this.imaginary = this.imaginary - c.imaginary;
    }
}
