package vikdev.com;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }
    @Override
    public void breathe(){
        System.out.println("Breath in breath out repeat");
    }

    @Override
    public  void eat(){
        System.out.println(getName()+" is eating");
    }
}
