package Inheritance.vehical;

public class Main {

    public static void main(String[] args) {

    Vehicle vehicle = new Vehicle(4,5,5,4,"Car");
    Car car = new Car("Car","SUV",5);
    Nexon nexon = new Nexon(1000000,2);
    nexon.speed();
    nexon.protection();
    nexon.light();
    nexon.price();

    }
}
