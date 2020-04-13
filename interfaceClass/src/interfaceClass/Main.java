package interfaceClass;

public class Main {

    public static void main(String[] args) {
        drawable obj = new circle();
        obj.draw();

    }
}
interface drawable{
    public void draw();
}
class rectangle implements drawable{
    public void draw(){
        System.out.println("Rectangle is drawing");
    }
}

class circle implements drawable{
    public void draw(){
        System.out.println("Circle is drawing");
    }
}
