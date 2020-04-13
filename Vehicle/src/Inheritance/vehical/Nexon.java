package Inheritance.vehical;

public class Nexon extends Car {
    int camera,price;
    public  Nexon( int price,int camera ){
        super("Car","SUV",5);
        this.price = price;
        this.camera = camera;
    }

    public void protection(){

        System.out.println("These are the protection provided in the car ");
        super.airBeg();
        System.out.println("ABS (Anti breaking System)");
        System.out.println("The Car have  "+camera+" Cameras");
    }
    public void light(){
        super.light();
        System.out.println("Car have 2 LED lights in the headlight");
    }
    public void price(){
        System.out.println("The price of this model of Nexon is : "+price);
    }
}
