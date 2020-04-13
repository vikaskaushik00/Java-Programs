package operatorchallange;

public class Main {

    public static void main(String[] args) {
	    double varOne =  20.00;
	    double varSecond = 80.00;
	    double bothSum = (varOne + varSecond) * 100.00;
	    double rem = bothSum % 40.00;
	    boolean bolValue = (rem == 0) ? true : false;
	    System.out.println(" The value is : " + bolValue);
	    if(!bolValue){
	        System.out.println("Got some reminder :)");
        }
    }
}
