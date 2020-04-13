package vikdev.com;

public class Parrot extends Bird {
    public Parrot(String name){
        super(name);
    }

    public void fly(){
        System.out.println(getName()+" is flying");
    }
}
