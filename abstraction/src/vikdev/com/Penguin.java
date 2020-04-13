package vikdev.com;

public class Penguin extends Bird {
    public Penguin(String name){
        super(name);
    }
    public void fly(){
        super.fly();
        System.out.println(getName()+" : I am not that good in flying can i swim instead");
    }
}
