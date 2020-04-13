package vikdev.com;

public class DogMain {

    public static void main(String args[]){
        Labrador obj1 = new Labrador("Rover");
        Dog obj2 = new Dog("Rover");
        System.out.println(obj1.equals(obj2));
        System.out.println(obj2.equals(obj1));


    }
}
