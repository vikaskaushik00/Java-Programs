package inheritanceCircle;

public class Cylinder extends Circle {
    double height;
    public Cylinder(double radius, double height){
        super(radius);
        if(height < 0){
            this.height = 0;
        }
        else
            this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        double circle = super.getArea();
        double area = circle * this.height;
        return area;
    }
}
