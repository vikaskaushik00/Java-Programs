package abstractClass;

public class Main {

    public static void main(String[] args) {
        rameshPhone obj = new sureshPhone();
        obj.call();
        obj.move();
        obj.dance();
        obj.cook();
    }
}

abstract class rameshPhone{
    public void call(){
        System.out.println("Calling...");
    }
   abstract public void move();
   abstract public void dance();
   abstract  public void cook();

}

abstract class maheshPhone extends rameshPhone{
    public void move(){
        System.out.println("Moving...");
    }
}

class sureshPhone extends maheshPhone{
    public void dance(){
        System.out.println("Dancing...");
    }
    public void cook(){
        System.out.println("Cooking...");
    }
}
