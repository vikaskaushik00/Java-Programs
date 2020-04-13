package Inheritance.vehical;

public class Car extends Vehicle {


    String typeOfCar;
    int airBeg;
    public Car(String typeOfVehicle,String typeOfCar,int airBeg){
        super(4,5,2,4,typeOfVehicle);
        this.typeOfCar = typeOfCar;
        this.airBeg = airBeg;
    }

    public void typeOfFuel(String type){
        System.out.println("Your vehicle run of : "+type+" fuel");
    }
    public void airBeg(){

        System.out.println("The car have "+this.airBeg+" air beg ");
    }
    public void light(){
        System.out.println("The car have : "+noLight+" light");
    }

    public void speed(){
        typeOfFuel("Petrol");
       if(this.gear == 1){
           super.speed(20);
       }
       else if(this.gear == 2)
           super.speed(35);
       else if (this.gear == 3)
           super.speed(50);
       else if(this.gear == 4)
           super.speed(70);
       else if (this.gear == 5)
           super.speed(100);
       else
           System.out.println("Wrong input");

    }

}
