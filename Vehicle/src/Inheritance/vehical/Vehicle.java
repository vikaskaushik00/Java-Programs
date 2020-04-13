package Inheritance.vehical;

public class Vehicle {
    int tyre,seat, noLight, gear;
     String typeOfVehicle;

    public Vehicle(int tyre,int seat,int gear,int noLight,String typeOfVehical){
        this.tyre = tyre;
        this.seat = seat;
        this.gear = gear;
        this.noLight = noLight;
        this.typeOfVehicle = typeOfVehical;
    }

    public void speed(int speed){
        System.out.println("The car is moving  with the speed : "+speed);

    }
    public void start(String onOff){
        System.out.println("Vehicle is : "+onOff);
    }

}
