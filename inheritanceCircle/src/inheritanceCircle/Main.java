package inheritanceCircle;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("Circle.radius : "+circle.getRadius());
        System.out.println("circle.Area : "+circle.getArea());
        Cylinder cyl = new Cylinder(5.55,7.25);
        System.out.println("Cylinder.getradius : "+cyl.getRadius());
        System.out.println("Cylinder.height"+cyl.getHeight());
        System.out.println("Cylinder.getArea " + cyl.getArea());
        System.out.println("Cylinder.getVolume "+cyl.getVolume());
    }
}
