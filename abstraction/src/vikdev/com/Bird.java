package vikdev.com;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println(getName()+" is eating");
    }
    @Override
    public  void breathe(){
        System.out.println("breath in breath out repeat");
    }

    public void fly(){
        System.out.println(getName()+" is flying");
    }
}
